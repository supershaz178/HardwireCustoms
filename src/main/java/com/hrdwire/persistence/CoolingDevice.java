package com.hrdwire.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Shahroz
 *
 */
@Entity
@Table(name = "COOLING_DEV")
public class CoolingDevice extends Parts {

	private static final long serialVersionUID = 312404231999136519L;

	@Id
	@Column(name = "COOL_DEV_ID", nullable = false)
	private Integer Id;

	@Column(name = "FAN_RADIUS", nullable = false)
	private Integer fanRadius;

	@Column(name = "FAN_SPEED", nullable = false, length = 6)
	private Integer fanSpeed;

	/*
	 * Parser or List is required Multiple fans are compatible with multiple
	 * sockets -- SocketReference can be used here
	 */
	@Column(name = "SOC_COM", nullable = false)
	private String socketCompatibility;

	@Column(name = "DEV_COLOR")
	private String deviceColor;

	@Column(name = "BASE_COLOR")
	private String baseColor;

	@Column(name = "PWR_REQ")
	private Double powerRequired;

	@Column(name = "AIR_FLOW")
	private Double airFlow;

	@Column(name = "DEV_TYPE", nullable = false)
	private String deviceType;

	// Liquid Cooling Specific variables -- not required for other types
	@Column(name = "LIQ_SLTS")
	private Integer fanSlots;

	@Column(name = "TUB_LEN")
	private Integer tubeLength;

	// Device Type Constants
	public static final String CPU_SINGLE_FAN_TYPE = "CSPU";
	public static final String CASE_FAN_TYPE = "CASE";
	public static final String MEM_COOLING_TYPE = "MEMR";
	public static final String HARD_DRV_TYPE = "HRDD";
	public static final String LIQUID_CPU_TYPE = "LIQC";

	public Integer getFanRadius()
	{
		return fanRadius;
	}

	public void setFanRadius(Integer fanRadius)
	{
		this.fanRadius = fanRadius;
	}

	public Integer getFanSpeed()
	{
		return fanSpeed;
	}

	public void setFanSpeed(Integer fanSpeed)
	{
		this.fanSpeed = fanSpeed;
	}

	public Double getPowerRequired()
	{
		return powerRequired;
	}

	public void setPowerRequired(Double powerRequired)
	{
		this.powerRequired = powerRequired;
	}

	public Double getAirFlow()
	{
		return airFlow;
	}

	public void setAirFlow(Double airFlow)
	{
		this.airFlow = airFlow;
	}

	public String getDeviceType()
	{
		return deviceType;
	}

	public void setDeviceType(String deviceType)
	{
		this.deviceType = deviceType;
	}

	public Integer getId()
	{
		return Id;
	}

	public void setId(Integer id)
	{
		Id = id;
	}

	public String getDeviceColor()
	{
		return deviceColor;
	}

	public void setFanColor(String deviceColor)
	{
		this.deviceColor = deviceColor;
	}

	public String getBaseColor()
	{
		return baseColor;
	}

	public void setBaseColor(String baseColor)
	{
		this.baseColor = baseColor;
	}

	public String getSocketCompatibility()
	{
		return socketCompatibility;
	}

	public void setSocketCompatibility(String socketCompatibility)
	{
		this.socketCompatibility = socketCompatibility;
	}

	public Integer getFanSlots()
	{
		return fanSlots;
	}

	public void setFanSlots(Integer fanSlots)
	{
		this.fanSlots = fanSlots;
	}

	public Integer getTubeLength()
	{
		return tubeLength;
	}

	public void setTubeLength(Integer tubeLength)
	{
		this.tubeLength = tubeLength;
	}

}
