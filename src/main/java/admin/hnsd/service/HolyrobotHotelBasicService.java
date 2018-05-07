/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotHotelBasicService.java 
 * Package Name:admin.hnsd.service 
 * Date:2018年1月29日 上午11:13:15 
 * author 汤玉林
 */ 
package admin.hnsd.service;

import java.util.List;

import admin.hnsd.model.HolyrobotHotelbasicinfo;
import admin.hnsd.model.HolyrobotRoombasicinfo;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月29日 上午11:13:15 
 */
public interface HolyrobotHotelBasicService {

	void saveOrUpdate(HolyrobotHotelbasicinfo hotelinfo);
	
	void insertBatch(List<HolyrobotHotelbasicinfo> list,int size);
}
