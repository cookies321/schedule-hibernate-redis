/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotAddressServiceImpl.java 
 * Package Name:admin.hnsd.service.impl 
 * Date:2018年1月29日 上午11:08:14 
 * author 汤玉林
 */ 
package admin.hnsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.dao.HolyrobotAddressDao;
import admin.hnsd.model.HolyrobotAddressinfo;
import admin.hnsd.service.HolyrobotAddressService;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月29日 上午11:08:14 
 */
@Service
@Transactional
public class HolyrobotAddressServiceImpl implements HolyrobotAddressService{

	
	@Resource 
	HolyrobotAddressDao holyrobotAddressDao;
	
	@Override
	public void saveOrUpdate(HolyrobotAddressinfo address) {
		holyrobotAddressDao.saveOrUpdate(address);
		
	}

	@Override
	@Transactional(propagation =Propagation.SUPPORTS)
	public void insertBatch(List<HolyrobotAddressinfo> list, int size) {
		holyrobotAddressDao.insertBatch(list, size);
		
	}

}
