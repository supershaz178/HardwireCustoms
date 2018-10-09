package com.hrdwire.dao;

import java.util.List;

import com.hrdwire.persistence.PowerSupply;

public interface PowerSupplyDao extends BaseDao<PowerSupply>{
	
	public PowerSupply selectByFullName(String fullName); 
	
	public List<PowerSupply> searchByPartialName(String partialName); 
	
	public List<PowerSupply> searchByType(String type); 
	
	public List<PowerSupply> searchByMaximumPower(Integer maxPower); 
	
	public List<PowerSupply> searchByEnergyRating(String rating); 
	
	public List<PowerSupply> searchByMaxPowerAndEnergyRating(Integer maxPower, String rating); 
	
	public List<PowerSupply> searchByTypeAndSLI(String type, boolean sliReady); 
	
	public List<PowerSupply> searchByMoxPowerByType(String type, Integer maxPower); 
	
} 
