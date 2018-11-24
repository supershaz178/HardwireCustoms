package com.hrdwire.service;

import java.math.BigDecimal;
import java.util.List;

import com.hrdwire.persistence.Build;
import com.hrdwire.persistence.Parts;
import com.hrdwire.persistence.Person;

public interface BuildService extends BaseService<Build>{
	
	public Boolean checkCompatibilty(List<Parts> partsList);
	
	public Build createBuild(List<Parts> partsList, Person owner);
	
	public void setStatusOfBuild(String oldStatus, String newStatus); 
	
	public List<Build> searchForBuilds(List<Parts> parmeters); 
	
	public Boolean tearDownBuild(Build tearDown); 
	
	public void changeOwner(Person owner); 
	
	public BigDecimal estimateCostOfBuild(List<Parts> partsForBuild, Build build);
	
	public Build changeSinglePart(Build changeBuild, Parts partToInsert); 
	
	public Build changeMultipleParts(Build changeBuild, List<Parts> partsToInsert); 

}
