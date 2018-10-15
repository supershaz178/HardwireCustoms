package com.hrdwire.dao;

import java.util.List;

import com.hrdwire.persistence.HardDrive;

public interface HardDriveDao extends BaseDao<HardDrive>{

	public HardDrive selectByFullName(String fullName); 
	
	public List<HardDrive> searchByCapacity(Integer capacity); 
	
	public List<HardDrive> searchByFormFactor(Double formFactor);
	
	public List<HardDrive> searchByRPM(Integer rpm); 
	
	public List<HardDrive> searchByPartialName(String partialName); 
	
	public List<HardDrive> searchByCapacityAndRPM(Integer capacity, Integer rpm);
	
	public List<HardDrive> searchByCapacityAndInterfaceType(String interfaceType, Integer capacity); 
}
