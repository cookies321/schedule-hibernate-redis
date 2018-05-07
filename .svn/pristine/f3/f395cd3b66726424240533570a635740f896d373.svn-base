/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotRouteinfoServiceImpl.java 
 * Package Name:admin.hnsd.service.impl 
 * Date:2018年2月6日 下午4:10:33 
 * author 汤玉林
 */ 
package admin.hnsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.dao.HolyrobotRouteinfoDao;
import admin.hnsd.model.HolyrobotRouteinfo;
import admin.hnsd.service.HolyrobotRouteinfoService;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年2月6日 下午4:10:33 
 */
@Service
@Transactional
public class HolyrobotRouteinfoServiceImpl implements HolyrobotRouteinfoService {

	@Resource
	HolyrobotRouteinfoDao routeinfoDao;
	
	@Override
	@Transactional(propagation =Propagation.SUPPORTS)
	public void insertBatch(List<HolyrobotRouteinfo> list,int size) {
		
		routeinfoDao.insertBatch(list, size);
	}

}
