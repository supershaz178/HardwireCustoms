package com.hrdwire.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee extends Person implements Serializable {

	private static final long serialVersionUID = -6663220101287137464L;

	@Id
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Column(name = "STATUS", nullable = false)
	private String status;

	@Column(name = "ADDRESS_1", length = 100)
	private String address_1;

	@Column(name = "ADDRESS_2")
	private String address_2;

	@Column(name = "CITY")
	private String city;

	@Column(name = "STATE")
	private String state;

	@Column(name = "ZIP_CODE", length = 5)
	private Integer zipCode;

	@Column(name = "USER_NAME", length = 20, unique = true, nullable = false)
	private String userName;

	@Column(name = "PASSWORD", length = 20, unique = true, nullable = false)
	private String password;

	@Column(name = "EMAIL")
	private String email;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getAddress_1()
	{
		return address_1;
	}

	public void setAddress_1(String address_1)
	{
		this.address_1 = address_1;
	}

	public String getAddress_2()
	{
		return address_2;
	}

	public void setAddress_2(String address_2)
	{
		this.address_2 = address_2;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public Integer getZipCode()
	{
		return zipCode;
	}

	public void setZipCode(Integer zipCode)
	{
		this.zipCode = zipCode;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

}
