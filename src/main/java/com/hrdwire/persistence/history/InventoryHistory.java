package com.hrdwire.persistence.history;

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

import com.hrdwire.persistence.Employee;
import com.hrdwire.persistence.InventoryItem;

@Entity
@Table(name="INVENTORY_HIST")
public class InventoryHistory implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="INV_ID", nullable = false)
	private Integer id;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="ID")
	private List<InventoryItemHistory> histInventoryItems; 
	
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

	@Column(name="TRNSFR_DATE")
	@Temporal(value = TemporalType.DATE)
	private Date recordTransferDate; 
	
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

	public List<InventoryItemHistory> getHistInventoryItems()
	{
		return histInventoryItems;
	}

	public void setHistInventoryItems(List<InventoryItemHistory> histInventoryItems)
	{
		this.histInventoryItems = histInventoryItems;
	}

	public List<InventoryItem> getInventoryItems()
	{
		return inventoryItems;
	}

	public void setInventoryItems(List<InventoryItem> inventoryItems)
	{
		this.inventoryItems = inventoryItems;
	}

	public Date getRecordTransferDate()
	{
		return recordTransferDate;
	}

	public void setRecordTransferDate(Date recordTransferDate)
	{
		this.recordTransferDate = recordTransferDate;
	} 
	
}
