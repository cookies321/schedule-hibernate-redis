package admin.hnsd.service;

import java.util.List;

import admin.hnsd.model.HolyrobotFlighttransferinfo;


public interface HolyrobotFlighttransferinfoService {
	
	void saveOrUpdate(HolyrobotFlighttransferinfo flighttransferinfo);
	
	void insertBatch(List<HolyrobotFlighttransferinfo> list,int size);


}
