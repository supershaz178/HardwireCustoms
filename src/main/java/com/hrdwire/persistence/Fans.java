/**
 * 
 */
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
@Table(name="FANS")
public class Fans extends Parts
{

	private static final long serialVersionUID = 312404231999136519L;
	
	@Id
	@Column(name="ID", nullable=false)
	private Integer Id; 
	
	@Column(name="FAN_RADIUS", nullable=false)
	private Integer fanRadius;
	
	@Column(name="FAN_SPEED", nullable=false, length=6)
	private Integer fanSpeed;
	
	@Column(name="FAN_COLOR")
	private String fanColor;
	
	@Column(name="BASE_COLOR")
	private String baseColor;
	
	@Column(name="PWR_REQ")
	private Double powerRequired;
	
	@Column(name="AIR_FLOW")
	private Double airFlow;
	
	@Column(name="FAN_TYPE", nullable=false)
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

	public Integer getId()
	{
		return Id;
	}

	public void setId(Integer id)
	{
		Id = id;
	}

	public String getFanColor()
	{
		return fanColor;
	}

	public void setFanColor(String fanColor)
	{
		this.fanColor = fanColor;
	}

	public String getBaseColor()
	{
		return baseColor;
	}

	public void setBaseColor(String baseColor)
	{
		this.baseColor = baseColor;
	}

}
