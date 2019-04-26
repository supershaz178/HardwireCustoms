/*@author:Shahroz Noorani
 * Date Created: 1/05/2016
 * Type: Persistence Class
 * Description: Describes person Super class used by Customer and Employee sub-classes*/

package com.hrdwire.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.hrdwire.persistence.reference.RoleReference;

@Embeddable
@MappedSuperclass
public abstract class Person implements Serializable {

	private static final long serialVersionUID = -7747668742245137756L;

	@Column(name = "FIRST_NAME", length = 20)
	private String firstName;

	@Column(name = "LAST_NAME", length = 20)
	private String lastName;

	@Column(name = "PHONE_NUM", length = 12)
	private Integer phoneNumber;

	@Column(name = "ROLE_ID")
	private RoleReference role;

	@Column(name = "SERIAL_NUM", nullable = false)
	private Integer personNumber;

	@Column(name = "CREATED_TIMESTAMP", nullable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createdTimestamp;

	@Column(name = "UPDATE_TIMESTAMP")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date updatedTimestamp;

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public Integer getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public RoleReference getRoleId()
	{
		return role;
	}

	public void setRoleId(RoleReference roleId)
	{
		this.role = roleId;
	}

	public Integer getPersonNumber()
	{
		return personNumber;
	}

	public void setPersonNumber(Integer personNumber)
	{
		this.personNumber = personNumber;
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

}
