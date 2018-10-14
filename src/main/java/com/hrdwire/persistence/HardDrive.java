package com.hrdwire.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HARD_DRIVE")
public class HardDrive extends Parts{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="HRD_DRV_ID", nullable=false)
	private Integer id; 
	
	@Column(name="CAPACITY", nullable=false)
	private Integer capacity;
	
	@Column(name="MEM_CACHE")
	private Integer cache; 
	
	@Column(name="INTERFACE_TYPE")
	private String interfaceType;
	
	@Column(name="FORM_FACTOR", nullable=false)
	private Double formFactor;
	
	@Column(name="RPM", nullable=false)
	private Integer rpm;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Integer getCache() {
		return cache;
	}

	public void setCache(Integer cache) {
		this.cache = cache;
	}

	public String getInterfaceType() {
		return interfaceType;
	}

	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}

	public Double getFormFactor() {
		return formFactor;
	}

	public void setFormFactor(Double formFactor) {
		this.formFactor = formFactor;
	}

	public Integer getRpm() {
		return rpm;
	}

	public void setRpm(Integer rpm) {
		this.rpm = rpm;
	} 
	

}
