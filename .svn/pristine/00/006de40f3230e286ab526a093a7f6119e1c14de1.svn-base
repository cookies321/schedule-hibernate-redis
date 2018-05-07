package admin.hnsd.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.dao.HolyrobotUrlDao;
import admin.hnsd.model.HolyrobotUrl;
import admin.hnsd.service.HolyrobotUrlService;

@Service("holyrobotUrlService")
@Transactional
public class HolyrobotUrlServiceImpl implements HolyrobotUrlService {

	@Resource
	HolyrobotUrlDao holyrobotUrlDao;

	@Override
	public void save(HolyrobotUrl url) {
		holyrobotUrlDao.save(url);
		System.out.println("11111111111111");
	}
}
