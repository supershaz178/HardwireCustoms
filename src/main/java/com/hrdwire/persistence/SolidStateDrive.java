package com.hrdwire.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SSD")
public class SolidStateDrive extends Parts {

	private static final long serialVersionUID = 5726104829110189217L;

	@Id
	@Column(name = "SSD_ID", nullable = false)
	private Integer id;

	@Column(name = "FORM_FACTOR", nullable = false)
	private Float formFactor;

	@Column(name = "CAPACITY", nullable = false)
	private Integer capacity;

	@Column(name = "MEMORY_COMPONENTS")
	private String memoryComponents;

	@Column(name = "INTERFACE_TYPE", nullable = false)
	private String interfaceType;

	@Column(name = "CONTROLLER")
	private String controller;

	@Column(name = "MAX_SEQUENTIAL_READ")
	private Integer maxSeqRead;

	@Column(name = "MAX_SEQUENTIAL_WRITE")
	private Integer maxSeqWrite;

	@Column(name = "RANDOM_READ_QD1")
	private Integer randomReadQD1;

	@Column(name = "RANDOM_READ_QD32")
	private Integer randomReadQD32;

	@Column(name = "RANDOM_WRITE_QD1")
	private Integer randomWriteQD1;

	@Column(name = "RANDOM_WRITE_QD32")
	private Integer randomWriteQD32;

	@Column(name = "MTBF")
	private Integer mtbf;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Float getFormFactor()
	{
		return formFactor;
	}

	public void setFormFactor(Float formFactor)
	{
		this.formFactor = formFactor;
	}

	public Integer getCapacity()
	{
		return capacity;
	}

	public void setCapacity(Integer capacity)
	{
		this.capacity = capacity;
	}

	public String getMemoryComponents()
	{
		return memoryComponents;
	}

	public void setMemoryComponents(String memoryComponents)
	{
		this.memoryComponents = memoryComponents;
	}

	public String getInterfaceType()
	{
		return interfaceType;
	}

	public void setInterfaceType(String interfaceType)
	{
		this.interfaceType = interfaceType;
	}

	public String getController()
	{
		return controller;
	}

	public void setController(String controller)
	{
		this.controller = controller;
	}

	public Integer getMaxSeqRead()
	{
		return maxSeqRead;
	}

	public void setMaxSeqRead(Integer maxSeqRead)
	{
		this.maxSeqRead = maxSeqRead;
	}

	public Integer getMaxSeqWrite()
	{
		return maxSeqWrite;
	}

	public void setMaxSeqWrite(Integer maxSeqWrite)
	{
		this.maxSeqWrite = maxSeqWrite;
	}

	public Integer getRandomReadQD1()
	{
		return randomReadQD1;
	}

	public void setRandomReadQD1(Integer randomReadQD1)
	{
		this.randomReadQD1 = randomReadQD1;
	}

	public Integer getRandomReadQD32()
	{
		return randomReadQD32;
	}

	public void setRandomReadQD32(Integer randomReadQD32)
	{
		this.randomReadQD32 = randomReadQD32;
	}

	public Integer getRandomWriteQD1()
	{
		return randomWriteQD1;
	}

	public void setRandomWriteQD1(Integer randomWriteQD1)
	{
		this.randomWriteQD1 = randomWriteQD1;
	}

	public Integer getRandomWriteQD32()
	{
		return randomWriteQD32;
	}

	public void setRandomWriteQD32(Integer randomWriteQD32)
	{
		this.randomWriteQD32 = randomWriteQD32;
	}

	public Integer getMtbf()
	{
		return mtbf;
	}

	public void setMtbf(Integer mtbf)
	{
		this.mtbf = mtbf;
	}

}
