package com.hrdwire.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "BUILD")
public class Build implements Serializable
{

	private static final long serialVersionUID = -9061274016370859776L;

	@Id
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Column(name = "TOTAL_COST", nullable = false)
	private Double totalCost;

	@Column(name = "BUILD_NAME", length = 50)
	private String buildName;

	@Column(name = "CUSTOMER_ID", nullable = false)
	@ManyToOne(cascade = CascadeType.ALL, targetEntity=Customer.class, fetch=FetchType.LAZY)
	private Customer customer;

	@Column(name = "BUILD_TYPE")
	private String buildType;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "PARTS")
	private List<Parts> parts;

	@Column(name = "STATUS", nullable = false)
	private String status;

	@Column(name = "SERIAL_NUM", nullable = false)
	private Integer serialNum;

	@Column(name = "CREATED_TIMESTAMP", nullable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createdTimestamp;

	@Column(name = "UPDATE_TIMESTAMP")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date updatedTimestamp;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Double getTotalCost()
	{
		return totalCost;
	}

	public void setTotalCost(Double totalCost)
	{
		this.totalCost = totalCost;
	}

	public String getBuildName()
	{
		return buildName;
	}

	public void setBuildName(String buildName)
	{
		this.buildName = buildName;
	}

	public Customer getCustomer()
	{
		return customer;
	}

	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	public String getBuildType()
	{
		return buildType;
	}

	public void setBuildType(String buildType)
	{
		this.buildType = buildType;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public Integer getSerialNum()
	{
		return serialNum;
	}

	public void setSerialNum(Integer serialNum)
	{
		this.serialNum = serialNum;
	}

	public Date getCreatedTimestamp()
	{
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp)
	{
		this.createdTimestamp = createdTimestamp;
	}

	public Date getUpdatedTimestamp()
	{
		return updatedTimestamp;
	}

	public void setUpdatedTimestamp(Date updatedTimestamp)
	{
		this.updatedTimestamp = updatedTimestamp;
	}

	public List<Parts> getParts()
	{
		return parts;
	}

	public void setParts(List<Parts> parts)
	{
		this.parts = parts;
	}

}
