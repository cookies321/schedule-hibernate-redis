/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotCommentServiceImpl.java 
 * Package Name:admin.hnsd.service.impl 
 * Date:2018年1月29日 上午11:11:37 
 * author 汤玉林
 */ 
package admin.hnsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.dao.HolyrobotCommentDao;
import admin.hnsd.model.HolyrobotCommentinfo;
import admin.hnsd.service.HolyrobotCommentService;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月29日 上午11:11:37 
 */
@Service
@Transactional
public class HolyrobotCommentServiceImpl implements HolyrobotCommentService{

	@Resource
	HolyrobotCommentDao holyrobotCommentDao;
	
	@Override
	public void save(HolyrobotCommentinfo commentinfo) {
		// TODO Auto-generated method stub
		holyrobotCommentDao.save(commentinfo);
	}
	
	@Override
	public void saveOrUpdate(HolyrobotCommentinfo commentinfo) {
		holyrobotCommentDao.saveOrUpdate(commentinfo);
		
	}

	@Override
	@Transactional(propagation =Propagation.SUPPORTS)
	public void insertBatch(List<HolyrobotCommentinfo> list, int size) {
		holyrobotCommentDao.insertBatch(list, size);
		
	}
}
