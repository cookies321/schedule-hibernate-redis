package admin.hnsd.service;

import java.util.List;

import admin.hnsd.model.HolyrobotFlightinfo;


public interface HolyrobotFlightinfoService {
	
	void saveOrUpdate(HolyrobotFlightinfo flightinfo);
	
	void insertBatch(List<HolyrobotFlightinfo> list,int size);

}
