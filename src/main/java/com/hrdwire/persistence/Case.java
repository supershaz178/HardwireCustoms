package com.hrdwire.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CASE")
public class Case extends Parts {
	
	private static final long serialVersionUID = -1185373859891261173L;
	
	@Id
	@Column(name = "CASE_ID", nullable = false)
	private Integer id; 
	
	@Column(name = "FORM_FACTOR", nullable=false)
	private String formFactor; 
	
	@Column(name="NUM_3_5_BAY")
	private Integer numberOf3_5Supported;
	
	@Column(name="NUM_5_BAYS")
	private Integer numberOf5Supported;
	
	@Column(name="HEIGHT")
	private Double height;
	
	@Column(name="LENGTH")
	private Double length;
	
	@Column(name="WIDTH")
	private Double width;
	
	@Column(name="WEIGHT")
	private Double weight;
	
	@Column(name="PCI_SLOTS", nullable=false)
	private Integer pciSlots;
	
	@Column(name="MAX_COOL_HEIGHT", nullable=false)
	private Double maximumCoolerHeight;
	
	@Column(name="COLOR")
	private String color; 
	
	@Column(name="NUM_OF_FANS")
	private Integer numberofFans;
	
	@Column(name="UBS_PORTS")
	private Integer usbPorts;
	
	@Column(name="AUDIO_PORT_IND")
	private Boolean hasAudioPorts;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFormFactor() {
		return formFactor;
	}

	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}

	public Integer getNumberOf3_5Supported() {
		return numberOf3_5Supported;
	}

	public void setNumberOf3_5Supported(Integer numberOf3_5Supported) {
		this.numberOf3_5Supported = numberOf3_5Supported;
	}

	public Integer getNumberOf5Supported() {
		return numberOf5Supported;
	}

	public void setNumberOf5Supported(Integer numberOf5Supported) {
		this.numberOf5Supported = numberOf5Supported;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getPciSlots() {
		return pciSlots;
	}

	public void setPciSlots(Integer pciSlots) {
		this.pciSlots = pciSlots;
	}

	public Double getMaximumCoolerHeight() {
		return maximumCoolerHeight;
	}

	public void setMaximumCoolerHeight(Double maximumCoolerHeight) {
		this.maximumCoolerHeight = maximumCoolerHeight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getNumberofFans() {
		return numberofFans;
	}

	public void setNumberofFans(Integer numberofFans) {
		this.numberofFans = numberofFans;
	}

	public Integer getUsbPorts() {
		return usbPorts;
	}

	public void setUsbPorts(Integer usbPorts) {
		this.usbPorts = usbPorts;
	}

	public Boolean getHasAudioPorts() {
		return hasAudioPorts;
	}

	public void setHasAudioPorts(Boolean hasAudioPorts) {
		this.hasAudioPorts = hasAudioPorts;
	} 

}
