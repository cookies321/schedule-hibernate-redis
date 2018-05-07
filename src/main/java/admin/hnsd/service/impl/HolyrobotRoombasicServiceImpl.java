/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotRoombasicServiceImpl.java 
 * Package Name:admin.hnsd.service.impl 
 * Date:2018年1月29日 上午11:22:53 
 * author 汤玉林
 */ 
package admin.hnsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.dao.HolyrobotRoombasicDao;
import admin.hnsd.model.HolyrobotRoombasicinfo;
import admin.hnsd.service.HolyrobotRoombasicService;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月29日 上午11:22:53 
 */
@Service
@Transactional
public class HolyrobotRoombasicServiceImpl implements HolyrobotRoombasicService{

	@Resource
	HolyrobotRoombasicDao holyrobotRoombasicDao;
	
	@Override
	public void saveOrUpdate(HolyrobotRoombasicinfo roominfo) {
		holyrobotRoombasicDao.saveOrUpdate(roominfo);
		
	}
	
	@Override
	@Transactional(propagation =Propagation.SUPPORTS)
	public void insertBatch(List<HolyrobotRoombasicinfo> list, int size) {
		holyrobotRoombasicDao.insertBatch(list, size);
		
	}

}
