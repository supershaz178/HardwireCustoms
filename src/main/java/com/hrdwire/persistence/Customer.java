package com.hrdwire.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer extends Person implements Serializable {

	private static final long serialVersionUID = -7261855465348375028L;

	@Id
	@Column(name = "CUST_ID", nullable = false)
	private Integer custId;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "BUILD")
	private List<Build> builds;

	@Column(name = "SATIS")
	private String satisfaction;

	public Integer getCustId()
	{
		return custId;
	}

	public void setCustId(Integer custId)
	{
		this.custId = custId;
	}

	public List<Build> getBuilds()
	{
		return builds;
	}

	public void setBuilds(List<Build> builds)
	{
		this.builds = builds;
	}

	public String getSatisfaction()
	{
		return satisfaction;
	}

	public void setSatisfaction(String satisfaction)
	{
		this.satisfaction = satisfaction;
	}

}
