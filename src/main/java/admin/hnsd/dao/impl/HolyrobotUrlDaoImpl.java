/** 
 * Project Name:hibernate-redis-test 
 * File Name:HolyrobotDaoImpl.java 
 * Package Name:admin.hnsd.dao.impl 
 * Date:2018年1月26日 下午1:53:15 
 * author 汤玉林
 */ 
package admin.hnsd.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.commons.dao.BaseDaoImpl;
import admin.hnsd.dao.HolyrobotUrlDao;
import admin.hnsd.model.HolyrobotUrl;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月26日 下午1:53:15 
 */
@Repository("holyrobotUrlDao")
public class HolyrobotUrlDaoImpl extends BaseDaoImpl<HolyrobotUrl> implements HolyrobotUrlDao {

}
