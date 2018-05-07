/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotRoutepriceinfoService.java 
 * Package Name:admin.hnsd.service 
 * Date:2018年2月6日 下午4:09:46 
 * author 汤玉林
 */ 
package admin.hnsd.service;

import java.util.List;

import admin.hnsd.model.HolyrobotRoutepriceinfo;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年2月6日 下午4:09:46 
 */
public interface HolyrobotRoutepriceinfoService {
	
	void save(HolyrobotRoutepriceinfo routePriceinfo);
	
	void saveorupdate(HolyrobotRoutepriceinfo routePriceinfo);

	void insertBatch(List<HolyrobotRoutepriceinfo> list,int size);
}
