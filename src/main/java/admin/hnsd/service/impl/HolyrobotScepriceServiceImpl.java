/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotScepriceServiceImpl.java 
 * Package Name:admin.hnsd.service.impl 
 * Date:2018年1月31日 上午10:29:05 
 * author 汤玉林
 */ 
package admin.hnsd.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transaction;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.dao.HolyrobotScepriceDao;
import admin.hnsd.model.HolyrobotScepriceinfo;
import admin.hnsd.service.HolyrobotScepriceService;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月31日 上午10:29:05 
 */
@Service
@Transactional
public class HolyrobotScepriceServiceImpl implements HolyrobotScepriceService{

	
	@Resource
	HolyrobotScepriceDao priceDao;
	
	@Override
	public void save(HolyrobotScepriceinfo price) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public void insertBatch(List<HolyrobotScepriceinfo> list,int size) {
		priceDao.insertBatch(list, size);
		
	}

	
	
}
