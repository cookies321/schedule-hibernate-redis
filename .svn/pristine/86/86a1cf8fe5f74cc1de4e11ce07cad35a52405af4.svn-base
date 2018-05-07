/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotHotelBasicServiceImpl.java 
 * Package Name:admin.hnsd.service.impl 
 * Date:2018年1月29日 上午11:15:12 
 * author 汤玉林
 */ 
package admin.hnsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.dao.HolyrobotHotelBasicDao;
import admin.hnsd.model.HolyrobotHotelbasicinfo;
import admin.hnsd.service.HolyrobotHotelBasicService;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月29日 上午11:15:12 
 */
@Service
@Transactional
public class HolyrobotHotelBasicServiceImpl implements HolyrobotHotelBasicService{

	@Resource
	HolyrobotHotelBasicDao holyrobotHotelBasicDao;
	
	@Override
	public void saveOrUpdate(HolyrobotHotelbasicinfo hotelinfo) {
		holyrobotHotelBasicDao.saveOrUpdate(hotelinfo);
		
	}

	@Override
	@Transactional(propagation =Propagation.SUPPORTS)
	public void insertBatch(List<HolyrobotHotelbasicinfo> list, int size) {
		holyrobotHotelBasicDao.insertBatch(list, size);
		
	}

}
