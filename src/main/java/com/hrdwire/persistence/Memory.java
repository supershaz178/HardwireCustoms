package com.hrdwire.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEMORY")
public class Memory extends Parts {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MEM_ID", nullable = false)
	private Integer id;

	@Column(name = "CAS_LATENCY")
	private Integer casLatency;

	@Column(name = "CAPACITY", nullable = false)
	private Integer capacity;

	@Column(name = "NUM_OF_PINS", nullable = false)
	private Integer pins;

	@Column(name = "TIMING")
	private String timing;

	@Column(name = "COLOR")
	private String color;

	@Column(name = "IS_BUFFERED")
	private boolean buffered;

	@Column(name = "VOLTAGE")
	private Double voltage;

	@Column(name = "HEAT_SPREAD")
	private String heatSpreader;

	@Column(name = "MEM_SPEED")
	private String memorySpeedType;

	@Column(name = "ECC", nullable = false)
	private boolean ecc;

	@Column(name = "NUM_OF_MODULES", nullable = false)
	private Integer numOfModules;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getCasLatency()
	{
		return casLatency;
	}

	public void setCasLatency(Integer casLatency)
	{
		this.casLatency = casLatency;
	}

	public Integer getCapacity()
	{
		return capacity;
	}

	public void setCapacity(Integer capacity)
	{
		this.capacity = capacity;
	}

	public Integer getPins()
	{
		return pins;
	}

	public void setPins(Integer pins)
	{
		this.pins = pins;
	}

	public String getTiming()
	{
		return timing;
	}

	public void setTiming(String timing)
	{
		this.timing = timing;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public boolean isBuffered()
	{
		return buffered;
	}

	public void setBuffered(boolean buffered)
	{
		this.buffered = buffered;
	}

	public Double getVoltage()
	{
		return voltage;
	}

	public void setVoltage(Double voltage)
	{
		this.voltage = voltage;
	}

	public String getHeatSpreader()
	{
		return heatSpreader;
	}

	public void setHeatSpreader(String heatSpreader)
	{
		this.heatSpreader = heatSpreader;
	}

	public String getMemorySpeedType()
	{
		return memorySpeedType;
	}

	public void setMemorySpeedType(String memorySpeedType)
	{
		this.memorySpeedType = memorySpeedType;
	}

	public boolean isEcc()
	{
		return ecc;
	}

	public void setEcc(boolean ecc)
	{
		this.ecc = ecc;
	}

	public Integer getNumOfModules()
	{
		return numOfModules;
	}

	public void setNumOfModules(Integer numOfModules)
	{
		this.numOfModules = numOfModules;
	}
}
