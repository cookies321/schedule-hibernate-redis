/** 
 * Project Name:hibernate-redis-test 
 * File Name:TestController.java 
 * Package Name:admin.controller 
 * Date:2018年1月25日 下午5:55:39 
 * author 汤玉林
 */ 
package admin.hnsd.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import admin.hnsd.dao.HolyrobotUrlDao;
import admin.hnsd.model.HolyrobotUrl;
import admin.hnsd.service.HolyrobotUrlService;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年1月25日 下午5:55:39 
 */
@Controller
public class TestController {

	@Autowired
	HolyrobotUrlService holyrobotUrlService;
	
	@RequestMapping("/")
	public String test() {
		HolyrobotUrl url =new HolyrobotUrl();
		url.setId(UUID.randomUUID().toString());
		url.setUrl("1234");
		url.setDatasource("Lvmama");
		holyrobotUrlService.save(url);
		System.out.println("agds");
		return "index";
	}
}
