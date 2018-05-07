package admin.hnsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.dao.HolyrobotFlightpriceinfoDao;
import admin.hnsd.model.HolyrobotFlightpriceinfo;
import admin.hnsd.service.HolyrobotFlightpriceinfoService;

@Service
@Transactional
public class HolyrobotFlightpriceinfoServiceImpl implements HolyrobotFlightpriceinfoService {
	
	@Resource
	HolyrobotFlightpriceinfoDao flightpriceinfoDao;
	
	@Override
	public void saveOrUpdate(HolyrobotFlightpriceinfo flightpriceinfoinfo) {
		// TODO Auto-generated method stub
		flightpriceinfoDao.saveOrUpdate(flightpriceinfoinfo);
	}

	@Override
	@Transactional(propagation =Propagation.SUPPORTS)
	public void insertBatch(List<HolyrobotFlightpriceinfo> list, int size) {
		// TODO Auto-generated method stub
		flightpriceinfoDao.insertBatch(list, size);
	}

}
