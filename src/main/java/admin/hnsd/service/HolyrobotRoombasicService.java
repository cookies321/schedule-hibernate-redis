/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotRoombasicService.java 
 * Package Name:admin.hnsd.service 
 * Date:2018年1月29日 上午11:22:39 
 * author 汤玉林
 */ 
package admin.hnsd.service;

import java.util.List;

import admin.hnsd.model.HolyrobotRoombasicinfo;
import admin.hnsd.model.HolyrobotRoomprice;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月29日 上午11:22:39 
 */
public interface HolyrobotRoombasicService {

	void saveOrUpdate(HolyrobotRoombasicinfo roominfo);
	
	void insertBatch(List<HolyrobotRoombasicinfo> list,int size);
}
