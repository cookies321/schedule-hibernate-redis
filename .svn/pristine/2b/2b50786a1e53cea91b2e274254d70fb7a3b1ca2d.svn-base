package admin.hnsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.dao.HolyrobotFlighttransferinfoDao;
import admin.hnsd.model.HolyrobotFlighttransferinfo;
import admin.hnsd.service.HolyrobotFlighttransferinfoService;

@Service
@Transactional
public class HolyrobotFlighttransferinfoServiceImpl implements HolyrobotFlighttransferinfoService {
	
	@Resource
	HolyrobotFlighttransferinfoDao flighttransferinfoDao;

	@Override
	public void saveOrUpdate(HolyrobotFlighttransferinfo flighttransferinfo) {
		// TODO Auto-generated method stub
		flighttransferinfoDao.saveOrUpdate(flighttransferinfo);
	}

	@Override
	@Transactional(propagation =Propagation.SUPPORTS)
	public void insertBatch(List<HolyrobotFlighttransferinfo> list, int size) {
		// TODO Auto-generated method stub
		flighttransferinfoDao.insertBatch(list, size);
	}

}
