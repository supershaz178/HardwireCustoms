package com.hrdwire.persistence.reference;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="SOCKET_REF")
public class SocketReference implements Serializable {

	private static final long serialVersionUID = -7064819027333204483L;
	
	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="SOCKET_TYPE", nullable=false)
	private String socketType; 
	
	@Column(name="COMP_COMPATIBILITY", nullable=false)
	private String computerCompatibilty; 
	
	@Column(name="COMPANY")
	private String company;
	
	@Column(name="SOCKET_STAND")
	private String socketStandard;
	
	@Column(name="ZIF")
	private boolean zif;
	
	@Column(name="YEAR_RELEASED", length=5)
	private Integer yearReleased;
	
	@Column(name="CREATED_ON", nullable=false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createdOn; 
	
	@Column(name="UPDATE_ON", nullable=false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date updatedOn;
	
	@Column(name="CREATED_BY", nullable=false)
	private String createdBy; 
	
	@Column(name="UPDATED_BY", nullable=false)
	private String updatedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSocketType() {
		return socketType;
	}

	public void setSocketType(String socketType) {
		this.socketType = socketType;
	}

	public String getComputerCompatibilty() {
		return computerCompatibilty;
	}

	public void setComputerCompatibilty(String computerCompatibilty) {
		this.computerCompatibilty = computerCompatibilty;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSocketStandard() {
		return socketStandard;
	}

	public void setSocketStandard(String socketStandard) {
		this.socketStandard = socketStandard;
	}

	public boolean isZif() {
		return zif;
	}

	public void setZif(boolean zif) {
		this.zif = zif;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	} 

}
