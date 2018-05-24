package com.hrdwire.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hrdwire.persistence.reference.SocketReference;

@Entity
@Table(name="PROCESSOR")
public class Processor extends Parts {

	private static final long serialVersionUID = -2479244058699750924L;
	@Id
	@Column(name="PROC_ID", nullable=false)
	private Integer id;
	
	@Column(name="PROC_TYP")
	private String processorType;
	
	@Column(name="SOCKET_TYP", nullable=false)
	private SocketReference socketType;
	
	@Column(name="CORE_ARCH_NM")
	private String coreArchName;
	
	@Column(name="NUM_OF_CORE")
	private Integer numOfCores;
	
	@Column(name="NUM_OF_THREAD", nullable=false)
	private Integer numofThreads;
	
	@Column(name="OPERATE_FREQ", nullable=false)
	private Double operatingFreq;
	
	@Column(name="MAX_OPER_FREQ")
	private Double maxOperatingFreq;
	
	@Column(name="L2_CACHE")
	private String cacheL2;
	
	@Column(name="L2_CACHE")
	private String cacheL3;
	
	@Column(name="MANUFACT_TECH")
	private Integer manufacturingTech;
	
	@Column(name="BIT_64_SUPPORT_IND", nullable=false)
	private Boolean hasSupport64Bit;
	
	@Column(name="HYPER_THREAD_SUPP_IND", nullable=false)
	private Boolean hasHyperThreading;
	
	@Column(name="VR_SUPP_IND")
	private Boolean hasVrSupport;
	
	@Column(name="INTEGRATE_GRAPH")
	private String integratedGraphics;
	
	@Column(name="GRAPH_BASE_FREQ")
	private String graphicsBaseFreq;
	
	@Column(name="GRAPH_MAX_FREQ")
	private String graphicsMaxFreq;
	
	@Column(name="PCI_VERSION")
	private Double pciVersion;
	
	@Column(name="NUM_PCI_LANES")
	private Integer numOfPciLanes;
	
	@Column(name="PWR_REQ", nullable=false)
	private Double powerRequired;
	
	@Column(name="MEM_TYPE_SUPP", nullable=false)
	private String memTypeSupported;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProcessorType() {
		return processorType;
	}

	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}

	public SocketReference getSocketType() {
		return socketType;
	}

	public void setSocketType(SocketReference socketType) {
		this.socketType = socketType;
	}

	public String getCoreArchName() {
		return coreArchName;
	}

	public void setCoreArchName(String coreArchName) {
		this.coreArchName = coreArchName;
	}

	public Integer getNumOfCores() {
		return numOfCores;
	}

	public void setNumOfCores(Integer numOfCores) {
		this.numOfCores = numOfCores;
	}

	public Integer getNumofThreads() {
		return numofThreads;
	}

	public void setNumofThreads(Integer numofThreads) {
		this.numofThreads = numofThreads;
	}

	public Double getOperatingFreq() {
		return operatingFreq;
	}

	public void setOperatingFreq(Double operatingFreq) {
		this.operatingFreq = operatingFreq;
	}

	public Double getMaxOperatingFreq() {
		return maxOperatingFreq;
	}

	public void setMaxOperatingFreq(Double maxOperatingFreq) {
		this.maxOperatingFreq = maxOperatingFreq;
	}

	public String getCacheL2() {
		return cacheL2;
	}

	public void setCacheL2(String cacheL2) {
		this.cacheL2 = cacheL2;
	}

	public String getCacheL3() {
		return cacheL3;
	}

	public void setCacheL3(String cacheL3) {
		this.cacheL3 = cacheL3;
	}

	public Integer getManufacturingTech() {
		return manufacturingTech;
	}

	public void setManufacturingTech(Integer manufacturingTech) {
		this.manufacturingTech = manufacturingTech;
	}

	public Boolean getHasSupport64Bit() {
		return hasSupport64Bit;
	}

	public void setHasSupport64Bit(Boolean hasSupport64Bit) {
		this.hasSupport64Bit = hasSupport64Bit;
	}

	public Boolean getHasHyperThreading() {
		return hasHyperThreading;
	}

	public void setHasHyperThreading(Boolean hasHyperThreading) {
		this.hasHyperThreading = hasHyperThreading;
	}

	public Boolean getHasVrSupport() {
		return hasVrSupport;
	}

	public void setHasVrSupport(Boolean hasVrSupport) {
		this.hasVrSupport = hasVrSupport;
	}

	public String getIntegratedGraphics() {
		return integratedGraphics;
	}

	public void setIntegratedGraphics(String integratedGraphics) {
		this.integratedGraphics = integratedGraphics;
	}

	public String getGraphicsBaseFreq() {
		return graphicsBaseFreq;
	}

	public void setGraphicsBaseFreq(String graphicsBaseFreq) {
		this.graphicsBaseFreq = graphicsBaseFreq;
	}

	public String getGraphicsMaxFreq() {
		return graphicsMaxFreq;
	}

	public void setGraphicsMaxFreq(String graphicsMaxFreq) {
		this.graphicsMaxFreq = graphicsMaxFreq;
	}

	public Double getPciVersion() {
		return pciVersion;
	}

	public void setPciVersion(Double pciVersion) {
		this.pciVersion = pciVersion;
	}

	public Integer getNumOfPciLanes() {
		return numOfPciLanes;
	}

	public void setNumOfPciLanes(Integer numOfPciLanes) {
		this.numOfPciLanes = numOfPciLanes;
	}

	public Double getPowerRequired() {
		return powerRequired;
	}

	public void setPowerRequired(Double powerRequired) {
		this.powerRequired = powerRequired;
	}

	public String getMemTypeSupported() {
		return memTypeSupported;
	}

	public void setMemTypeSupported(String memTypeSupported) {
		this.memTypeSupported = memTypeSupported;
	} 

}
