/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotRoompriceServiceImpl.java 
 * Package Name:admin.hnsd.service.impl 
 * Date:2018年1月29日 上午8:58:08 
 * author 汤玉林
 */ 
package admin.hnsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.dao.HolyrobotRoompriceDao;
import admin.hnsd.model.HolyrobotRoomprice;
import admin.hnsd.service.HolyrobotRoompriceService;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月29日 上午8:58:08 
 */
@Service("holyrobotRoompriceService")
@Transactional
public class HolyrobotRoompriceServiceImpl implements HolyrobotRoompriceService {

	@Resource
	HolyrobotRoompriceDao holyrobotRoompriceDao;
	
	@Override
	public void save(HolyrobotRoomprice price) {
		holyrobotRoompriceDao.save(price);
		
	}

	
	@Override
	public void saveOrUpdate(HolyrobotRoomprice price) {
		holyrobotRoompriceDao.saveOrUpdate(price);
		
	}

	@Override
	@Transactional(propagation =Propagation.SUPPORTS)
	public void insertBatch(List<HolyrobotRoomprice> priceList, int size) {
		holyrobotRoompriceDao.insertBatch(priceList, size);
	}


	

}
