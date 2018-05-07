/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotPictureService.java 
 * Package Name:admin.hnsd.service 
 * Date:2018年1月29日 上午11:20:56 
 * author 汤玉林
 */ 
package admin.hnsd.service;

import java.util.List;

import admin.hnsd.model.HolyrobotPictureinfo;
import admin.hnsd.model.HolyrobotRoombasicinfo;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月29日 上午11:20:56 
 */
public interface HolyrobotPictureService {

	void saveOrUpdate(HolyrobotPictureinfo picture);
	
	void insertBatch(List<HolyrobotPictureinfo> list,int size);
}
