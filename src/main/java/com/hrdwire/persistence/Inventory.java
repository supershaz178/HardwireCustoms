package com.hrdwire.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="INVENTORY")
public class Inventory implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID", nullable = false)
	private Integer id;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="ID")
	private List<InventoryItem> inventoryItems; 
	
	@Column(name = "DATE_CREATED", nullable= false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dateCreated; 

	@Column(name="CREATED_BY", nullable=false)
	private Employee createBy; 
	
	@Column(name="REFERANCE_NUM")
	private Integer refNum; 
	
	@Column(name = "TOT_NUM_PARTS")
	private Integer totalNumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Employee getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Employee createBy) {
		this.createBy = createBy;
	}

	public Integer getRefNum() {
		return refNum;
	}

	public void setRefNum(Integer refNum) {
		this.refNum = refNum;
	}

	public Integer getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(Integer totalNumber) {
		this.totalNumber = totalNumber;
	}

	public List<InventoryItem> getInventoryItems() {
		return inventoryItems;
	}

	public void setInventoryItems(List<InventoryItem> inventoryItems) {
		this.inventoryItems = inventoryItems;
	} 
	
}
