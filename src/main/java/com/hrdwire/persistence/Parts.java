package com.hrdwire.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
@MappedSuperclass
public class Parts implements Serializable  {

	private static final long serialVersionUID = -335321033389944415L;
	
	@Column(name="SERIAL_NUM", nullable=false)
	private Integer serialNum; 
	
	@Column(name="BRAND")
	private String brand;
	
	@Column(name="SERIES")
	private String series;
	
	@Column(name="NAME")
	private String name; 
	
	@Column(name="RATING")
	private Integer rating;
	
	@Column(name="PART_TYPE")
	private String partType;

	@Column(name="CREATED_TIMESTAMP", nullable=false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createdTimestamp; 
	
	@Column(name="UPDATE_TIMESTAMP")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date updatedTimestamp;
	
	public Integer getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(Integer serialNum) {
		this.serialNum = serialNum;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getPartType() {
		return partType;
	}

	public void setPartType(String partType) {
		this.partType = partType;
	} 
	

}
