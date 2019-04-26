package com.hrdwire.dao;

import java.util.List;
import com.hrdwire.persistence.CoolingDevice;

public interface CoolingDeviceDao extends BaseDao<CoolingDevice> {

	public CoolingDevice selectByFullName(String fullName);

	public List<CoolingDevice> searchByFanRadius(Integer radius);

	public List<CoolingDevice> searchByPartialName(String partialName);

	public List<CoolingDevice> searchByFanSpeed(Integer fanSpeed);

	public List<CoolingDevice> searchByDeviceColor(String color);

	public List<CoolingDevice> searchByBaseColor(String color);

	public List<CoolingDevice> searchByAirFlow(Double AirFlow);

	public List<CoolingDevice> searchByDeviceType(String deviceType);

	public List<CoolingDevice> searchByFanRadiusAndSpeed(Integer fanSpeed,
			Integer radius);

	public List<CoolingDevice> searchByLiquidCoolerTypeProperties(
			Integer fanSlots, Integer tubeLength);
}
