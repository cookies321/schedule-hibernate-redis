package admin.hnsd.service.quartz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.google.common.collect.Sets;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.Response;
import admin.hnsd.commons.redis.JedisServiceImpl;
import admin.hnsd.commons.utils.BeanAndMapUtils;
import admin.hnsd.model.HolyrobotAddressinfo;
import admin.hnsd.model.HolyrobotCommentinfo;
import admin.hnsd.model.HolyrobotHotelbasicinfo;
import admin.hnsd.model.HolyrobotPictureinfo;	
import admin.hnsd.model.HolyrobotRoombasicinfo;
import admin.hnsd.model.HolyrobotRoomprice;
import admin.hnsd.model.HolyrobotRouteinfo;
import admin.hnsd.model.HolyrobotSceinfo;
import admin.hnsd.model.HolyrobotScepriceinfo;
import admin.hnsd.model.HolyrobotUrl;
import admin.hnsd.service.HolyrobotAddressService;
import admin.hnsd.service.HolyrobotCommentService;
import admin.hnsd.service.HolyrobotHotelBasicService;
import admin.hnsd.service.HolyrobotPictureService;
import admin.hnsd.service.HolyrobotRoombasicService;
import admin.hnsd.service.HolyrobotRoompriceService;
import admin.hnsd.service.HolyrobotRouteinfoService;
import admin.hnsd.service.HolyrobotSceinfoService;
import admin.hnsd.service.HolyrobotScepriceService;
import admin.hnsd.service.HolyrobotUrlService;

@Service("quartzService")
public class QuartzService {

	public static final Logger logger= LoggerFactory.getLogger(QuartzService.class);

	@Resource
	HolyrobotUrlService holyrobotUrlService;

	@Resource
	HolyrobotRoompriceService holyrobotRoompriceService;

	@Resource
	HolyrobotPictureService  holyrobotPictureService;

	@Resource
	HolyrobotHotelBasicService hotelbasicService;

	@Resource
	HolyrobotAddressService addressService;

	@Resource
	HolyrobotCommentService commentService;

	@Resource
	HolyrobotRoombasicService roombasicService;
	
	@Resource 
	HolyrobotSceinfoService sceinfoService;
	
	@Resource
	HolyrobotScepriceService scepriceService;
	

	@Resource(name="jedisService")
	JedisServiceImpl  jedisService;

	//@Scheduled(cron="0/1 * * * * ?")
	public void test() {

		String key ="map-"+UUID.randomUUID().toString();
		String value ="123";
		HolyrobotUrl url =new HolyrobotUrl();
		url.setId(UUID.randomUUID().toString());
		url.setUrl("1234");
		url.setDatasource("Lvmama");
		url.setLastupdatetime(new SimpleDateFormat("yyy-MM-dd HH:mm:ss").format(new Date()));
		url.setCreatedate(new SimpleDateFormat("yyy-MM-dd HH:mm:ss").format(new Date()));
		Map<String, String> objToMap2 =  BeanAndMapUtils.objToMap2(url);
		System.out.println(objToMap2);
		//jedisService.hmset(key, objToMap2);
		//holyrobotUrlService.save(url);
		System.out.println("124141241");
	}

	//@Scheduled(cron="0 0/2 * * * ?")
	@Scheduled(cron="0 0/1 * * * ?")
	public void test2() {
		new Thread(new AddressinfoTask()).start();
		new Thread(new CommentTask()).start();
		new Thread(new HotelInfoTask()).start();
		new Thread(new PictureTask()).start();
		new Thread(new RoombasicTask()).start();
		new Thread(new SceinfoTask()).start();
		new Thread(new SceinfoPriceTask()).start();
		logger.info("all------------------------------task end");
	}
	@Scheduled(cron="0 0/5 * * * ?")
	public void test3() {
		new Thread(new RoompriceTask()).start();
		logger.info("roomprice----------------------task end");
	}
	

	class RoompriceTask implements Runnable{

		@Override
		public void run() {
			logger.info("star get roomPrice-------------------");
			
			Map<String, Response<Map<String, String>>> responses = 
	                new HashMap<String, Response<Map<String, String>>>();
			
			Jedis jedis=jedisService.getJedis();
			Pipeline pipelined = jedis.pipelined();
			List<HolyrobotRoomprice> roomPriceList = new ArrayList<HolyrobotRoomprice>();
			String key ="Roomprice-*";
			Response<Set<String>> keys2 = pipelined.keys(key);
			pipelined.sync();//同步一下，下面的get方法之前必须有这个方法
			
			Set<String> keys = keys2.get();
			for (String string : keys) {
				Response<Map<String, String>> hgetAll = pipelined.hgetAll(string);
				responses.put(string, hgetAll);
			}
			pipelined.sync();
			logger.info("roomPrice总数："+keys.size());
			for (String string : responses.keySet()) {
				Map<String, String> map = responses.get(string).get();
				HolyrobotRoomprice price = (HolyrobotRoomprice) BeanAndMapUtils.mapToObject(map, HolyrobotRoomprice.class);
				roomPriceList.add(price);
				
			}
			responses.clear();
			holyrobotRoompriceService.insertBatch(roomPriceList, 1000);
			roomPriceList.clear();
			for (String string : keys) {
				pipelined.del(string);
			}
			pipelined.sync();
			jedis.close();

		}

	}

	class AddressinfoTask implements Runnable{

		@Override
		public void run() {
			logger.info("star get addressinfo-------------------");
			List<HolyrobotAddressinfo> addressList = new ArrayList<HolyrobotAddressinfo>();
			String key ="Address*";
			Set<String> keys = jedisService.getKeys(key);
			logger.info("addressinfo总数："+keys.size());
			for (String string : keys) {
				Map<String, String> map = jedisService.hgetAll(string);
				HolyrobotAddressinfo price = (HolyrobotAddressinfo) BeanAndMapUtils.mapToObject(map, HolyrobotAddressinfo.class);
				addressList.add(price);
				
				//jedisService.del(string);
			}
			addressService.insertBatch(addressList, 1000);
			addressList.clear();
			for (String string : keys) {
				jedisService.del(string);
			}

		}


	}

	class RoombasicTask implements Runnable{

		@Override
		public void run() {
			logger.info("star get roombasicinfo-------------------");
			
			Map<String, Response<Map<String, String>>> responses = 
	                new HashMap<String, Response<Map<String, String>>>();
			
			Jedis jedis=jedisService.getJedis();
			Pipeline pipelined = jedis.pipelined();
			List<HolyrobotRoombasicinfo> roominfoList = new ArrayList<HolyrobotRoombasicinfo>();
			String key ="Roombasic*";
			Response<Set<String>> keys2 = pipelined.keys(key);
			pipelined.sync();//同步一下，下面的get方法之前必须有这个方法
			
			Set<String> keys = keys2.get();
			for (String string : keys) {
				Response<Map<String, String>> hgetAll = pipelined.hgetAll(string);
				responses.put(string, hgetAll);
			}
			pipelined.sync();
			
			logger.info("roombasicinfo总数："+keys.size());
			for (String string : responses.keySet()) {
				Map<String, String> map = responses.get(string).get();
				HolyrobotRoombasicinfo price = (HolyrobotRoombasicinfo) BeanAndMapUtils.mapToObject(map, HolyrobotRoombasicinfo.class);
				roominfoList.add(price);
			}
			responses.clear();
			roombasicService.insertBatch(roominfoList, 1000);
			roominfoList.clear();
			for (String string : keys) {
				pipelined.del(string);
				
			}
			pipelined.sync();
			jedis.close();
		}


	}

	class CommentTask implements Runnable{

		@Override
		public void run() {
			logger.info("star get commentinfo-------------------");
			List<HolyrobotCommentinfo> commentList = new ArrayList<HolyrobotCommentinfo>();
			String key ="Comment*";
			Set<String> keys = jedisService.getKeys(key);
			logger.info("commentinfo总数："+keys.size());
			for (String string : keys) {
				Map<String, String> map = jedisService.hgetAll(string);
				HolyrobotCommentinfo comment = (HolyrobotCommentinfo) BeanAndMapUtils.mapToObject(map, HolyrobotCommentinfo.class);
				String content = comment.getContent();
				if(findEmoji(content)){
					content = content.replaceAll("[^\\u0000-\\uFFFF]", "");
					comment.setContent(content);
				}
				commentService.saveOrUpdate(comment);
				commentList.add(comment);
				
				//jedisService.del(string);
			}
			//logger.info("评论插入结束----");
			commentService.insertBatch(commentList, 1000);
			commentList.clear();
			for (String string : keys) {
				jedisService.del(string);
			}
		}

	}

	class HotelInfoTask implements Runnable{

		@Override
		public void run() {
			logger.info("star get hotelbasicinfo-------------------");
			List<HolyrobotHotelbasicinfo> hotelinfoList = new ArrayList<HolyrobotHotelbasicinfo>();
			String key ="Hotelinfo*";
			Set<String> keys = jedisService.getKeys(key);
			logger.info("hotelbasicinfo总数："+keys.size());
			for (String string : keys) {
				Map<String, String> map = jedisService.hgetAll(string);
				HolyrobotHotelbasicinfo price = (HolyrobotHotelbasicinfo) BeanAndMapUtils.mapToObject(map, HolyrobotHotelbasicinfo.class);
				hotelinfoList.add(price);
				
				//jedisService.del(string);
			}
			hotelbasicService.insertBatch(hotelinfoList, 1000);
			hotelinfoList.clear();
			for (String string : keys) {
				jedisService.del(string);
			}
		}

	}


	class PictureTask implements Runnable{

		@Override
		public void run() {
			logger.info("star get picture-------------------");
			
			Map<String, Response<Map<String, String>>> responses = 
	                new HashMap<String, Response<Map<String, String>>>();
			
			Jedis jedis=jedisService.getJedis();
			Pipeline pipelined = jedis.pipelined();
			
			List<HolyrobotPictureinfo> pictureList = new ArrayList<HolyrobotPictureinfo>();
			String key ="Picture*";
			Response<Set<String>> keys2 = pipelined.keys(key);
			pipelined.sync();//同步一下，下面的get方法之前必须有这个方法
			
			Set<String> keys = keys2.get();
			for (String string : keys) {
				Response<Map<String, String>> hgetAll = pipelined.hgetAll(string);
				responses.put(string, hgetAll);
			}
			pipelined.sync();
			
			logger.info("picture总数："+keys.size());
			for (String string : responses.keySet()) {
				Map<String, String> map = responses.get(string).get();
				
				HolyrobotPictureinfo price = (HolyrobotPictureinfo) BeanAndMapUtils.mapToObject(map, HolyrobotPictureinfo.class);
				pictureList.add(price);
				
			}
			responses.clear();
			System.out.println("list大小："+pictureList.size());
			holyrobotPictureService.insertBatch(pictureList, 1000);
			pictureList.clear();
			for (String string : keys) {
				pipelined.del(string);
				//jedisService.del(string);
			}
			pipelined.sync();
			jedis.close();
		}

	}
	
	class SceinfoTask implements Runnable{

		@Override
		public void run() {
			logger.info("star get sceinfo-------------------");
			List<HolyrobotSceinfo> sceinfoList = new ArrayList<HolyrobotSceinfo>();
			String key ="Sceinfo*";
			Set<String> keys = jedisService.getKeys(key);
			logger.info("Sceinfo总数："+keys.size());
			for (String string : keys) {
				Map<String, String> map = jedisService.hgetAll(string);
				HolyrobotSceinfo price = (HolyrobotSceinfo) BeanAndMapUtils.mapToObject(map, HolyrobotSceinfo.class);
				sceinfoList.add(price);
				
				//jedisService.del(string);
			}
			System.out.println("list大小："+sceinfoList.size());
			sceinfoService.insertBatch(sceinfoList, 1000);
			sceinfoList.clear();
			/*for (String string : keys) {
				jedisService.del(string);
			}*/
		}

	}
	
	
	class SceinfoPriceTask implements Runnable{

		@Override
		public void run() {
			logger.info("star get scepriceinfo-------------------");
			List<HolyrobotScepriceinfo> scepriceList = new ArrayList<HolyrobotScepriceinfo>();
			String key ="Sceprice*";
			Set<String> keys = jedisService.getKeys(key);
			logger.info("Scepriceinfo总数："+keys.size());
			for (String string : keys) {
				Map<String, String> map = jedisService.hgetAll(string);
				HolyrobotScepriceinfo price = (HolyrobotScepriceinfo) BeanAndMapUtils.mapToObject(map, HolyrobotScepriceinfo.class);
				scepriceList.add(price);
				
				//jedisService.del(string);
			}
			System.out.println("list大小："+scepriceList.size());
			scepriceService.insertBatch(scepriceList, 1000);
			scepriceList.clear();
			/*for (String string : keys) {
				jedisService.del(string);
			}*/
		}

	}


	public static boolean findEmoji(String content) {
		Pattern pattern = Pattern.compile("[^\\u0000-\\uFFFF]");
		Matcher matcher = pattern.matcher(content);
		if (matcher.find()) {
			return true;
		} else {
			return false;
		}
	}


}
