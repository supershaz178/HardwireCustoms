package com.hrdwire.service;

import java.util.HashMap;
import java.util.List;

import com.hrdwire.dao.BaseDao;
import com.hrdwire.persistence.CoolingDevice;

public interface CoolingDeviceService extends BaseDao<CoolingDevice>
{
	public CoolingDevice updateCoolingDevice(CoolingDevice updateDevice); 
	
	public List<CoolingDevice> determineCompatibility(CoolingDevice compatibleDevice); 
	
	public List<CoolingDevice> searchByParameters(HashMap<String,String> parameters); 
	
	public List<CoolingDevice> listAllCoolingDevices(); 

}
