package com.hrdwire.dao;

import java.util.List;

import com.hrdwire.persistence.SolidStateDrive;

public interface SolidStateDriveDao extends BaseDao<SolidStateDrive>
{
	public SolidStateDrive selectByFullName(String fuulName); 
	
	public List<SolidStateDrive> searchByPartialName(String partialName);
	
	public List<SolidStateDrive> searchByCapacity(Integer capacity); 
	
	public List<SolidStateDrive> searchByFormFactor(String formFactor); 
	
	public List<SolidStateDrive> searchByInterfaceType(String interfaceType); 
	
	public List<SolidStateDrive> searchByCapacityAndFormFactor(Integer capacity, String formFactor);  
}
