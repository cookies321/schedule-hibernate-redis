/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotScepriceService.java 
 * Package Name:admin.hnsd.service 
 * Date:2018年1月31日 上午10:28:47 
 * author 汤玉林
 */ 
package admin.hnsd.service;

import java.util.List;

import admin.hnsd.model.HolyrobotScepriceinfo;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月31日 上午10:28:47 
 */
public interface HolyrobotScepriceService {

	
	void save(HolyrobotScepriceinfo price);
	
	void insertBatch(List<HolyrobotScepriceinfo> list,int size);
}
