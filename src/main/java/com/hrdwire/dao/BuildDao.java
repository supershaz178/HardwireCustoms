package com.hrdwire.dao;

import java.util.List;

import com.hrdwire.persistence.Build;
import com.hrdwire.persistence.Customer;

public interface BuildDao extends BaseDao<Build>
{
	//Base Dao methods 
	@Override
	public void create(Build build); 
	
	@Override
	public void update(Build build); 

	@Override
	public void delete(Build build); 

	@Override
	public Build selectById(Integer id); 
	
	//Build BO Specific 
	public List<Build> searchByCustomer(Customer customer); 
	
	public List<Build> searchByPatialBuildName(String partialName); 
	
	public List<Build> searchByPartId(Integer partId); 
	
	public Build selectBySerialNumber(Integer serialNumber); 
	
	public Build selectByFullName(String fullBuildName); 
	
	public Build selectByTotalCost(Double totalCost);
	
	public List<Build> searchByBuildType(String buildType);
	
	public List<Build> searchByStatus(String buildStatus); 
}
