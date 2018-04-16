/**
 * 
 */
package com.hrdwire.persistence;

/**
 * @author Shahroz
 *
 */
public class Fans extends Parts
{

	private static final long serialVersionUID = 312404231999136519L;
	private Integer fanRadius;
	private Integer fanSpeed;
	private String color;
	private Double powerRequired;
	private Double airFlow;
	private String fanType;

	// Fan Type Constants
	private static final String CPU_FAN_TYPE = "CPU_FAN";
	private static final String CASE_FAN_TYPE = "CASE_FAN";

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

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
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

	public String getFanType()
	{
		return fanType;
	}

	public void setFanType(String fanType)
	{
		this.fanType = fanType;
	}

}
