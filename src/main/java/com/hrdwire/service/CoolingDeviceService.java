package com.hrdwire.service;

import java.util.HashMap;
import java.util.List;

import com.hrdwire.dao.BaseDao;
import com.hrdwire.persistence.Build;
import com.hrdwire.persistence.CoolingDevice;

public interface CoolingDeviceService extends BaseDao<CoolingDevice>
{
	public CoolingDevice updateCoolingDevice(CoolingDevice updateDevice); 
	
	public Boolean determineCompatibility(CoolingDevice compatibleDevice, Build build); 
	
	public List<CoolingDevice> searchByParameters(HashMap<String,String> parameters); 
	
	public List<CoolingDevice> listAllCoolingDevices(); 

}