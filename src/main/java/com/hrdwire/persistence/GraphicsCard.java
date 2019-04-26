package com.hrdwire.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GRAPHICS_CRD")
public class GraphicsCard extends Parts {

	private static final long serialVersionUID = -5177121968462898733L;

	@Id
	@Column(name = "GRPH_CRD_ID", nullable = false)
	private Integer id;

	@Column(name = "INTER_TYPE", nullable = false)
	private String interfaceType;

	@Column(name = "CUDA_CORES", nullable = false)
	private Integer cudaCores;

	@Column(name = "CORE_CLK_SPD", nullable = false)
	private Double coreClockSpeed;

	@Column(name = "BST_CLK_SPD", nullable = false)
	private Double boostClockSpeed;

	@Column(name = "MEM_CLK")
	private Integer memoryClock;

	@Column(name = "MEM_CAP", nullable = false)
	private Integer memCapacity;

	@Column(name = "MEM_TYPE", nullable = false)
	private String memType;

	@Column(name = "HDMI_IND")
	private Boolean hasHDMI;

	@Column(name = "VGA_IND")
	private Boolean hasVGA;

	@Column(name = "DP_IND")
	private Boolean hasDisplayPort;

	@Column(name = "DVI_IND")
	private Boolean hasDVI;

	@Column(name = "VR_IND")
	private Boolean hasVRcapabilities;

	@Column(name = "MAX_RESOL", nullable = false, length = 15)
	private String maxResolution;

	@Column(name = "SLI_IND")
	private Boolean hasSliSupport;

	@Column(name = "SLOT_WIDTH")
	private Integer slotWidth;

	@Column(name = "CHIPSET_MANFAC")
	private String chipsetManufacturer;

	@Column(name = "VR_READY_IND")
	private Boolean hasVrReady;

	@Column(name = "DIRECT_X_VER", nullable = false, length = 5)
	private Integer directXVersion;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getInterfaceType()
	{
		return interfaceType;
	}

	public void setInterfaceType(String interfaceType)
	{
		this.interfaceType = interfaceType;
	}

	public Integer getCudaCores()
	{
		return cudaCores;
	}

	public void setCudaCores(Integer cudaCores)
	{
		this.cudaCores = cudaCores;
	}

	public Double getCoreClockSpeed()
	{
		return coreClockSpeed;
	}

	public void setCoreClockSpeed(Double coreClockSpeed)
	{
		this.coreClockSpeed = coreClockSpeed;
	}

	public Double getBoostClockSpeed()
	{
		return boostClockSpeed;
	}

	public void setBoostClockSpeed(Double boostClockSpeed)
	{
		this.boostClockSpeed = boostClockSpeed;
	}

	public Integer getMemoryClock()
	{
		return memoryClock;
	}

	public void setMemoryClock(Integer memoryClock)
	{
		this.memoryClock = memoryClock;
	}

	public Integer getMemCapacity()
	{
		return memCapacity;
	}

	public void setMemCapacity(Integer memCapacity)
	{
		this.memCapacity = memCapacity;
	}

	public String getMemType()
	{
		return memType;
	}

	public void setMemType(String memType)
	{
		this.memType = memType;
	}

	public Boolean getHasHDMI()
	{
		return hasHDMI;
	}

	public void setHasHDMI(Boolean hasHDMI)
	{
		this.hasHDMI = hasHDMI;
	}

	public Boolean getHasVGA()
	{
		return hasVGA;
	}

	public void setHasVGA(Boolean hasVGA)
	{
		this.hasVGA = hasVGA;
	}

	public Boolean getHasDisplayPort()
	{
		return hasDisplayPort;
	}

	public void setHasDisplayPort(Boolean hasDisplayPort)
	{
		this.hasDisplayPort = hasDisplayPort;
	}

	public Boolean getHasDVI()
	{
		return hasDVI;
	}

	public void setHasDVI(Boolean hasDVI)
	{
		this.hasDVI = hasDVI;
	}

	public Boolean getHasVRcapabilities()
	{
		return hasVRcapabilities;
	}

	public void setHasVRcapabilities(Boolean hasVRcapabilities)
	{
		this.hasVRcapabilities = hasVRcapabilities;
	}

	public String getMaxResolution()
	{
		return maxResolution;
	}

	public void setMaxResolution(String maxResolution)
	{
		this.maxResolution = maxResolution;
	}

	public Boolean getHasSliSupport()
	{
		return hasSliSupport;
	}

	public void setHasSliSupport(Boolean hasSliSupport)
	{
		this.hasSliSupport = hasSliSupport;
	}

	public Integer getSlotWidth()
	{
		return slotWidth;
	}

	public void setSlotWidth(Integer slotWidth)
	{
		this.slotWidth = slotWidth;
	}

	public String getChipsetManufacturer()
	{
		return chipsetManufacturer;
	}

	public void setChipsetManufacturer(String chipsetManufacturer)
	{
		this.chipsetManufacturer = chipsetManufacturer;
	}

	public Boolean getHasVrReady()
	{
		return hasVrReady;
	}

	public void setHasVrReady(Boolean hasVrReady)
	{
		this.hasVrReady = hasVrReady;
	}

	public Integer getDirectXVersion()
	{
		return directXVersion;
	}

	public void setDirectXVersion(Integer directXVersion)
	{
		this.directXVersion = directXVersion;
	}

}
