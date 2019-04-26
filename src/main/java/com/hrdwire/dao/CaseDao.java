package com.hrdwire.dao;

import java.util.List;

import com.hrdwire.persistence.Case;

public interface CaseDao extends BaseDao<Case> {

	public Case searchByFullName(String fullName);

	public List<Case> searchByPartialName(String partialName);

	public List<Case> searchByFormFactor(String formFactor);

	public List<Case> searchByHeight(Double height);

	public List<Case> searchByLenght(Double length);

	public List<Case> searchByWidth(Double width);

	public List<Case> searchByNumPCISlots(Integer numPCISlots);

	public List<Case> searchByMaxCoolerHeight(Double height);

	public List<Case> searchByTotalDimensions(Double height, Double width,
			Double length);

	public List<Case> searchByPartialNameAndFormFactor(String partialName,
			String formFactor);

	public List<Case> searchByFormFactorAndNumOfPCISlots(String formFactor,
			Integer numPCISlots);

}
