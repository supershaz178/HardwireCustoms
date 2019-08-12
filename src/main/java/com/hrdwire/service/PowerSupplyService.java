package com.hrdwire.service;

import java.util.HashMap;
import java.util.List;

import com.hrdwire.persistence.Build;
import com.hrdwire.persistence.PowerSupply;

public interface PowerSupplyService extends BaseService<PowerSupply> {

	public List<PowerSupply> searchByParameters(
			HashMap<String, String> parameters);

	public Boolean isAbleToSupplyPower(PowerSupply newPowerSupply, Build build);

	public Boolean canLast10Years(PowerSupply powerSupply);

	public List<PowerSupply> listAllPowerSupply();

}
