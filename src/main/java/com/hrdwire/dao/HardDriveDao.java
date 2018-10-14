package com.hrdwire.dao;

import com.hrdwire.persistence.HardDrive;

public interface HardDriveDao extends BaseDao<HardDrive>{

	public HardDrive selectByFullName(String fullName); 
	
	public HardDrive searchByCapacity(Integer capacity); 
	
	public HardDrive searchByFormFactor(Double formFactor);
	
	public HardDrive searchByRPM(Integer rpm); 
	
	public HardDrive searchByPartialName(String partialName); 
	
	public HardDrive searchByCapacityAndRPM(Integer capacity, Integer rpm);
	
	public HardDrive searchByCapacityAndInterfaceType(String interfaceType, Integer capacity); 
}
