package com.hrdwire.persistence;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.hrdwire.persistence.reference.SocketReference;

import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name = "MOTHERBOARD")
public class Motherboard extends Parts {

	private static final long serialVersionUID = 4119187399715489930L;

	@Id
	@Column(name = "MOTH_BRD_ID", nullable = false)
	private Integer id;

	@Column(name = "FORM_FACTOR", nullable = false)
	private String formFactor;

	@Column(name = "SOCKET", nullable = false)
	private SocketReference socketType;

	@Column(name = "CHIPSET")
	private String chipset;

	@Column(name = "CPU_TYPE")
	private String cpuType;

	@Column(name = "NUM_MEMORY_SLOTS")
	private Integer numOfMemorySlots;

	@Column(name = "NUM_MEMORY_PINS")
	private Integer numOfMemoryPins;

	@Column(name = "MEMORY_STANDARD", nullable = false)
	private String memStandard;

	@Column(name = "MEM_MAX_SPEED", nullable = false)
	private String memMaxSpeed;

	@Column(name = "MEM_MIN_SPEED")
	private String memMinSpeed;

	@Column(name = "MEM_OVERCLOCK")
	private boolean memOverclock;

	@Column(name = "MAX_MEMORY", nullable = false, length = 4)
	private Integer maxMemory;

	@Column(name = "CHANNEL_TYPE_SUPP")
	private String channelSupport;

	@Column(name = "NUM_PCI_EXPRESS_SLOTS", nullable = false)
	private Integer numPCIExpressSlots;

	@Column(name = "NUM_SATA3_SLOTS", nullable = false)
	private Integer numSata3Ports;

	@Column(name = "NUM_SATA_EXPRESS_SLOTS", nullable = false)
	private Integer numSataExpressPorts;

	@Column(name = "NUM_M2_PORTS")
	private Integer numM2Ports;

	@Column(name = "RAID_0_SUPP")
	private boolean raid0Support;

	@Column(name = "RAID_1_SUPP")
	private boolean raid1Support;

	@Column(name = "RAID_5_SUPP")
	private boolean raid5Support;

	@Column(name = "RAID_10_SUPP")
	private boolean raid10Support;

	@Column(name = "RAID_50_SUPP")
	private boolean raid50Support;

	@Column(name = "RAID_15_SUPP")
	private boolean raid15Support;

	@Column(name = "LAN_SUPP")
	private boolean lanSupport;

	@Column(name = "MAX_LAN_SPEED")
	private Integer maxLanSpeed;

	@Column(name = "NUM_AUDIO_CHANNEL")
	private Integer numAudioChannels;

	@Column(name = "AVAILABLE_PS2")
	private boolean availablePS2Port;

	@Column(name = "AVAILABLE_DVI")
	private boolean availableDVIPort;

	@Column(name = "AVAILABLE_DSUB")
	private boolean availableDSubPort;

	@Column(name = "AVAILABLE_HDMI")
	private boolean availableHdmiPort;

	@Column(name = "AVAILABLE_RJ45")
	private boolean availableEthernetPort;

	@Column(name = "AVAILABLE_DP")
	private boolean availableDPPort;

	@Column(name = "AVAILABLE_USB2")
	private boolean availableUSB2Port;

	@Column(name = "AVAILABLE_USB3")
	private boolean availableUSB3Port;

	@Column(name = "AVAILABLE_USB31")
	private boolean availableUSB31Port;

	@Column(name = "AVAILABLE_SOUT")
	private boolean availableSOutPort;

	@Column(name = "AVAILABLE_AUDIO_PORT")
	private boolean availableAudioPort;

	@Column(name = "NUM_ADD_USB_PORTS", nullable = false, length = 2)
	private Integer additionalUSBPorts;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getFormFactor()
	{
		return formFactor;
	}

	public void setFormFactor(String formFactor)
	{
		this.formFactor = formFactor;
	}

	public SocketReference getSocketType()
	{
		return socketType;
	}

	public void setSocketType(SocketReference socketType)
	{
		this.socketType = socketType;
	}

	public String getChipset()
	{
		return chipset;
	}

	public void setChipset(String chipset)
	{
		this.chipset = chipset;
	}

	public String getCpuType()
	{
		return cpuType;
	}

	public void setCpuType(String cpuType)
	{
		this.cpuType = cpuType;
	}

	public Integer getNumOfMemorySlots()
	{
		return numOfMemorySlots;
	}

	public void setNumOfMemorySlots(Integer numOfMemorySlots)
	{
		this.numOfMemorySlots = numOfMemorySlots;
	}

	public Integer getNumOfMemoryPins()
	{
		return numOfMemoryPins;
	}

	public void setNumOfMemoryPins(Integer numOfMemoryPins)
	{
		this.numOfMemoryPins = numOfMemoryPins;
	}

	public String getMemStandard()
	{
		return memStandard;
	}

	public void setMemStandard(String memStandard)
	{
		this.memStandard = memStandard;
	}

	public String getMemMaxSpeed()
	{
		return memMaxSpeed;
	}

	public void setMemMaxSpeed(String memMaxSpeed)
	{
		this.memMaxSpeed = memMaxSpeed;
	}

	public String getMemMinSpeed()
	{
		return memMinSpeed;
	}

	public void setMemMinSpeed(String memMinSpeed)
	{
		this.memMinSpeed = memMinSpeed;
	}

	public boolean isMemOverclock()
	{
		return memOverclock;
	}

	public void setMemOverclock(boolean memOverclock)
	{
		this.memOverclock = memOverclock;
	}

	public Integer getMaxMemory()
	{
		return maxMemory;
	}

	public void setMaxMemory(Integer maxMemory)
	{
		this.maxMemory = maxMemory;
	}

	public String getChannelSupport()
	{
		return channelSupport;
	}

	public void setChannelSupport(String channelSupport)
	{
		this.channelSupport = channelSupport;
	}

	public Integer getNumPCIExpressSlots()
	{
		return numPCIExpressSlots;
	}

	public void setNumPCIExpressSlots(Integer numPCIExpressSlots)
	{
		this.numPCIExpressSlots = numPCIExpressSlots;
	}

	public Integer getNumSata3Ports()
	{
		return numSata3Ports;
	}

	public void setNumSata3Ports(Integer numSata3Ports)
	{
		this.numSata3Ports = numSata3Ports;
	}

	public Integer getNumSataExpressPorts()
	{
		return numSataExpressPorts;
	}

	public void setNumSataExpressPorts(Integer numSataExpressPorts)
	{
		this.numSataExpressPorts = numSataExpressPorts;
	}

	public Integer getNumM2Ports()
	{
		return numM2Ports;
	}

	public void setNumM2Ports(Integer numM2Ports)
	{
		this.numM2Ports = numM2Ports;
	}

	public boolean isRaid0Support()
	{
		return raid0Support;
	}

	public void setRaid0Support(boolean raid0Support)
	{
		this.raid0Support = raid0Support;
	}

	public boolean isRaid1Support()
	{
		return raid1Support;
	}

	public void setRaid1Support(boolean raid1Support)
	{
		this.raid1Support = raid1Support;
	}

	public boolean isRaid5Support()
	{
		return raid5Support;
	}

	public void setRaid5Support(boolean raid5Support)
	{
		this.raid5Support = raid5Support;
	}

	public boolean isRaid10Support()
	{
		return raid10Support;
	}

	public void setRaid10Support(boolean raid10Support)
	{
		this.raid10Support = raid10Support;
	}

	public boolean isRaid50Support()
	{
		return raid50Support;
	}

	public void setRaid50Support(boolean raid50Support)
	{
		this.raid50Support = raid50Support;
	}

	public boolean isRaid15Support()
	{
		return raid15Support;
	}

	public void setRaid15Support(boolean raid15Support)
	{
		this.raid15Support = raid15Support;
	}

	public boolean isLanSupport()
	{
		return lanSupport;
	}

	public void setLanSupport(boolean lanSupport)
	{
		this.lanSupport = lanSupport;
	}

	public Integer getMaxLanSpeed()
	{
		return maxLanSpeed;
	}

	public void setMaxLanSpeed(Integer maxLanSpeed)
	{
		this.maxLanSpeed = maxLanSpeed;
	}

	public Integer getNumAudioChannels()
	{
		return numAudioChannels;
	}

	public void setNumAudioChannels(Integer numAudioChannels)
	{
		this.numAudioChannels = numAudioChannels;
	}

	public boolean isAvailablePS2Port()
	{
		return availablePS2Port;
	}

	public void setAvailablePS2Port(boolean availablePS2Port)
	{
		this.availablePS2Port = availablePS2Port;
	}

	public boolean isAvailableDVIPort()
	{
		return availableDVIPort;
	}

	public void setAvailableDVIPort(boolean availableDVIPort)
	{
		this.availableDVIPort = availableDVIPort;
	}

	public boolean isAvailableDSubPort()
	{
		return availableDSubPort;
	}

	public void setAvailableDSubPort(boolean availableDSubPort)
	{
		this.availableDSubPort = availableDSubPort;
	}

	public boolean isAvailableHdmiPort()
	{
		return availableHdmiPort;
	}

	public void setAvailableHdmiPort(boolean availableHdmiPort)
	{
		this.availableHdmiPort = availableHdmiPort;
	}

	public boolean isAvailableEthernetPort()
	{
		return availableEthernetPort;
	}

	public void setAvailableEthernetPort(boolean availableEthernetPort)
	{
		this.availableEthernetPort = availableEthernetPort;
	}

	public boolean isAvailableDPPort()
	{
		return availableDPPort;
	}

	public void setAvailableDPPort(boolean availableDPPort)
	{
		this.availableDPPort = availableDPPort;
	}

	public boolean isAvailableUSB2Port()
	{
		return availableUSB2Port;
	}

	public void setAvailableUSB2Port(boolean availableUSB2Port)
	{
		this.availableUSB2Port = availableUSB2Port;
	}

	public boolean isAvailableUSB3Port()
	{
		return availableUSB3Port;
	}

	public void setAvailableUSB3Port(boolean availableUSB3Port)
	{
		this.availableUSB3Port = availableUSB3Port;
	}

	public boolean isAvailableUSB31Port()
	{
		return availableUSB31Port;
	}

	public void setAvailableUSB31Port(boolean availableUSB31Port)
	{
		this.availableUSB31Port = availableUSB31Port;
	}

	public boolean isAvailableSOutPort()
	{
		return availableSOutPort;
	}

	public void setAvailableSOutPort(boolean availableSOutPort)
	{
		this.availableSOutPort = availableSOutPort;
	}

	public boolean isAvailableAudioPort()
	{
		return availableAudioPort;
	}

	public void setAvailableAudioPort(boolean availableAudioPort)
	{
		this.availableAudioPort = availableAudioPort;
	}

	public Integer getAdditionalUSBPorts()
	{
		return additionalUSBPorts;
	}

	public void setAdditionalUSBPorts(Integer additionalUSBPorts)
	{
		this.additionalUSBPorts = additionalUSBPorts;
	}

}