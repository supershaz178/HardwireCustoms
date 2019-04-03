package com.hrdwire.service;

import java.util.HashMap;
import java.util.List;

import com.hrdwire.persistence.Case;

public interface CaseService extends BaseService<Case>{
	
	public Case updateDimensions(Double height, Double width, Double length, Case updateDim); 
		
	public Case updateCaseStatistics(Case updateCase);
	
	public Case updateCasePrice(Case priceCase, Double newPrice); 

	public List<Case> searchForCaseProduct(HashMap<String, String> parameters); 
	
	public List<Case> listAllCases(); 

}
