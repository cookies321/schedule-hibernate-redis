/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotRoutepriceinfoServiceImpl.java 
 * Package Name:admin.hnsd.service.impl 
 * Date:2018年2月6日 下午4:12:59 
 * author 汤玉林
 */ 
package admin.hnsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.dao.HolyrobotRoutepriceinfoDao;
import admin.hnsd.model.HolyrobotRoutepriceinfo;
import admin.hnsd.service.HolyrobotRoutepriceinfoService;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年2月6日 下午4:12:59 
 */
@Service
@Transactional
public class HolyrobotRoutepriceinfoServiceImpl implements HolyrobotRoutepriceinfoService {

	@Resource
	HolyrobotRoutepriceinfoDao routePriceDao;
	
	
	@Override
	public void save(HolyrobotRoutepriceinfo routePriceinfo) {
		// TODO Auto-generated method stub
		routePriceDao.save(routePriceinfo);
	}
	
	@Override
	public void saveorupdate(HolyrobotRoutepriceinfo routePriceinfo) {
		// TODO Auto-generated method stub
		routePriceDao.saveOrUpdate(routePriceinfo);
	}
	
	
	@Override
	@Transactional(propagation =Propagation.SUPPORTS)
	public void insertBatch(List<HolyrobotRoutepriceinfo> list, int size) {
		routePriceDao.insertBatch(list, size);
		
	}

}
