package admin.hnsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.dao.HolyrobotFlightinfoDao;
import admin.hnsd.model.HolyrobotFlightinfo;
import admin.hnsd.service.HolyrobotFlightinfoService;

@Service
@Transactional
public class HolyrobotFlightinfoServiceImpl implements HolyrobotFlightinfoService {
	
	@Resource 
	HolyrobotFlightinfoDao holyrobotFlightinfoDao;

	@Override
	public void saveOrUpdate(HolyrobotFlightinfo flightinfo) {
		// TODO Auto-generated method stub
		holyrobotFlightinfoDao.saveOrUpdate(flightinfo);
	}

	@Override
	@Transactional(propagation =Propagation.SUPPORTS)
	public void insertBatch(List<HolyrobotFlightinfo> list, int size) {
		// TODO Auto-generated method stub
		holyrobotFlightinfoDao.insertBatch(list, size);
	}

}
