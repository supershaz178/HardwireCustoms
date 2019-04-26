package com.hrdwire.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POWER_SUPPLIES")
public class PowerSupply extends Parts {

	private static final long serialVersionUID = -7796330632159619139L;

	@Id
	@Column(name = "PWR_SUP_ID", nullable = false)
	private Integer id;

	@Column(name = "TYPE", nullable = false)
	private String type;

	@Column(name = "MAX_POWER_W", nullable = false)
	private Integer maxPower;

	@Column(name = "PFC")
	private String pfc;

	@Column(name = "SLI_READY", nullable = false)
	private boolean sliReady;

	@Column(name = "MODULARITY")
	private String Modularity;

	@Column(name = "EFFICENCY")
	private Float efficency;

	@Column(name = "ENERGY_RATING", nullable = false)
	private String energyRating;

	@Column(name = "OVER_VOLT_PROTECT")
	private boolean overVolatageProtection;

	@Column(name = "MIN_INPUT_VOLT")
	private Integer minInputVoltage;

	@Column(name = "MAX_INPUT_VOLT")
	private Integer maxInputVoltage;

	@Column(name = "MTBF")
	private Integer mtbf;

	@Column(name = "WEIGHT")
	private Float weight;

	@Column(name = "MAIN_CONNECTOR")
	private String mainConnector;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public Integer getMaxPower()
	{
		return maxPower;
	}

	public void setMaxPower(Integer maxPower)
	{
		this.maxPower = maxPower;
	}

	public String getPfc()
	{
		return pfc;
	}

	public void setPfc(String pfc)
	{
		this.pfc = pfc;
	}

	public boolean isSliReady()
	{
		return sliReady;
	}

	public void setSliReady(boolean sliReady)
	{
		this.sliReady = sliReady;
	}

	public String getModularity()
	{
		return Modularity;
	}

	public void setModularity(String modularity)
	{
		Modularity = modularity;
	}

	public Float getEfficency()
	{
		return efficency;
	}

	public void setEfficency(Float efficency)
	{
		this.efficency = efficency;
	}

	public String getEnergyRating()
	{
		return energyRating;
	}

	public void setEnergyRating(String energyRating)
	{
		this.energyRating = energyRating;
	}

	public boolean isOverVolatageProtection()
	{
		return overVolatageProtection;
	}

	public void setOverVolatageProtection(boolean overVolatageProtection)
	{
		this.overVolatageProtection = overVolatageProtection;
	}

	public Integer getMinInputVoltage()
	{
		return minInputVoltage;
	}

	public void setMinInputVoltage(Integer minInputVoltage)
	{
		this.minInputVoltage = minInputVoltage;
	}

	public Integer getMaxInputVoltage()
	{
		return maxInputVoltage;
	}

	public void setMaxInputVoltage(Integer maxInputVoltage)
	{
		this.maxInputVoltage = maxInputVoltage;
	}

	public Integer getMtbf()
	{
		return mtbf;
	}

	public void setMtbf(Integer mtbf)
	{
		this.mtbf = mtbf;
	}

	public Float getWeight()
	{
		return weight;
	}

	public void setWeight(Float weight)
	{
		this.weight = weight;
	}

	public String getMainConnector()
	{
		return mainConnector;
	}

	public void setMainConnector(String mainConnector)
	{
		this.mainConnector = mainConnector;
	}

}
