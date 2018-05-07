/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotRoompriceService.java 
 * Package Name:admin.hnsd.service 
 * Date:2018年1月29日 上午8:57:13 
 * author 汤玉林
 */ 
package admin.hnsd.service;

import java.util.List;

import admin.hnsd.model.HolyrobotRoomprice;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月29日 上午8:57:13 
 */
public interface HolyrobotRoompriceService {

	void save(HolyrobotRoomprice price);
	
	void saveOrUpdate(HolyrobotRoomprice price);
	
	void insertBatch(List<HolyrobotRoomprice> priceList,int size);
}
