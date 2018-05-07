/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotSceinfoServiceImpl.java 
 * Package Name:admin.hnsd.service.impl 
 * Date:2018年1月31日 上午10:06:40 
 * author 汤玉林
 */ 
package admin.hnsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.dao.HolyrobotSceinfoDao;
import admin.hnsd.model.HolyrobotSceinfo;
import admin.hnsd.service.HolyrobotSceinfoService;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月31日 上午10:06:40 
 */
@Service
@Transactional
public class HolyrobotSceinfoServiceImpl  implements HolyrobotSceinfoService{

	@Resource
	HolyrobotSceinfoDao sceinfoDao;
	
	@Override
	public void save(HolyrobotSceinfo sceinfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public void insertBatch(List<HolyrobotSceinfo> list,int size) {
		sceinfoDao.insertBatch(list, size);
		
	}

}
