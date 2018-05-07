/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotCommentService.java 
 * Package Name:admin.hnsd.service 
 * Date:2018年1月29日 上午11:10:57 
 * author 汤玉林
 */ 
package admin.hnsd.service;

import java.util.List;

import admin.hnsd.model.HolyrobotCommentinfo;
import admin.hnsd.model.HolyrobotRoombasicinfo;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月29日 上午11:10:57 
 */
public interface HolyrobotCommentService {
	
	void save(HolyrobotCommentinfo commentinfo);
	
	void saveOrUpdate(HolyrobotCommentinfo commentinfo);
	
	void insertBatch(List<HolyrobotCommentinfo> list,int size);
}
