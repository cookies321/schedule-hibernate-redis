/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotPictureServiceImpl.java 
 * Package Name:admin.hnsd.service.impl 
 * Date:2018年1月29日 上午11:21:28 
 * author 汤玉林
 */ 
package admin.hnsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.dao.HolyrobotPictureDao;
import admin.hnsd.model.HolyrobotPictureinfo;
import admin.hnsd.service.HolyrobotPictureService;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月29日 上午11:21:28 
 */
@Service
@Transactional
public class HolyrobotPictureServiceImpl  implements HolyrobotPictureService{

	@Resource
	HolyrobotPictureDao holyrobotPictureDao;
	
	@Override
	public void saveOrUpdate(HolyrobotPictureinfo picture) {
		holyrobotPictureDao.saveOrUpdate(picture);
		
	}

	@Override
	@Transactional(propagation =Propagation.SUPPORTS)
	public void insertBatch(List<HolyrobotPictureinfo> list, int size) {
		holyrobotPictureDao.insertBatch(list, size);
		
	}

}
