package admin.hnsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import admin.hnsd.dao.HolyrobotFlightinputinfoDao;
import admin.hnsd.model.HolyrobotFlightinputinfo;
import admin.hnsd.service.HolyrobotFlightinputinfoService;


@Service
@Transactional
public class HolyrobotFlightinputinfoServiceImpl implements HolyrobotFlightinputinfoService {
	
	@Resource
	HolyrobotFlightinputinfoDao flightinputinfoDao;
	
	@Override
	public void saveOrUpdate(HolyrobotFlightinputinfo flightinputinfo) {
		// TODO Auto-generated method stub
		flightinputinfoDao.saveOrUpdate(flightinputinfo);
	}

	@Override
	@Transactional(propagation =Propagation.SUPPORTS)
	public void insertBatch(List<HolyrobotFlightinputinfo> list, int size) {
		// TODO Auto-generated method stub
		flightinputinfoDao.insertBatch(list, size);
		
	}

}
