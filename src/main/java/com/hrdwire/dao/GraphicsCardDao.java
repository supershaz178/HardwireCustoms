package com.hrdwire.dao;

import java.util.List;

import com.hrdwire.persistence.GraphicsCard;

public interface GraphicsCardDao extends BaseDao<GraphicsCard> {

	public GraphicsCard searchByFullName(String fullName);

	public List<GraphicsCard> searchByPartialName(String partialName);

	public List<GraphicsCard> searchByInterfaceType(String interfaceType);

	public List<GraphicsCard> searchByNumberOfCudaCores(Integer numberOfCores);

	public List<GraphicsCard> searchByCoreClockSpeed(Double coreSpeed);

	public List<GraphicsCard> searchByBoostedClockSpeed(Double boostedSpeed);

	public List<GraphicsCard> searchByMemoryCapacity(Integer capacity);

	public List<GraphicsCard> searchByMemoryType(String memType);

	public List<GraphicsCard> searchByMaxResolution(String maxRes);

	public List<GraphicsCard> searchByDirectXVersion(Integer version);

	public List<GraphicsCard> searchByCoreClockSpeedDetails(Double coreSpeed,
			Double boostedSpeed);

	public List<GraphicsCard> searchByMemoryDetails(Integer capacity,
			String type);

	public List<GraphicsCard> searchByDisplayDetails(String maxRes,
			Integer directXVersion);

}
