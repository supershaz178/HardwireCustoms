package com.hrdwire.dao;

import java.util.List;

import com.hrdwire.persistence.Memory;

public interface MemoryDao extends BaseDao<Memory> {

	public Memory selectByFullName(String fullName);

	public List<Memory> searchByCasLatency(Integer casLatency);

	public List<Memory> searchByNumberOfModules(Integer modules);

	public List<Memory> searchByNumberOfPins(Integer numOfPins);

	public List<Memory> searchByMemorySpeed(String speed);

	public List<Memory> searchByVoltage(Double voltage);

	public List<Memory> searchByColor(String color);

	public List<Memory> searchByCapacity(Integer Capacity);

	public List<Memory> searchByTiming(String timing);

	public List<Memory> searchByPartialName(String partialName);

	public List<Memory> searchByCapacityAndNumOfModules(Integer capacity,
			Integer numOfModules);

	public List<Memory> searchByHeatSpreadRating(String heatSpread);
}
