package com.hrdwire.persistence.history;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.hrdwire.persistence.Employee;
import com.hrdwire.persistence.Inventory;
import com.hrdwire.persistence.Parts;


@Entity
@Table(name = "INVENTORY_ITEM_HIST")
public class InventoryItemHistory implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="INV_ITEM_ID")
	private Integer id; 

	@Column(name="INVENTORY_ID", nullable=false)
	@ManyToOne(cascade=CascadeType.ALL)
	private Inventory inventory; 
	
	@Column(name="PART_ID", nullable = false)
	private Parts part; 
	
	@Column(name="TOT_NUMBER_PART")
	private Integer totalNumber; 
		
	@Column(name="COMMENTS", length = 100)
	private String comments; 
	
	@Column(name="CREATED_BY")
	private Employee createdBy;
	
	@Column(name="CREATED_ON")
	@Temporal(value= TemporalType.TIMESTAMP)
	private Date createdOn;
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Parts getPartId() {
		return part;
	}
	public void setPartId(Parts partId) {
		this.part = partId;
	}
	public Integer getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(Integer totalNumber) {
		this.totalNumber = totalNumber;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Employee getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	public Parts getPart() {
		return part;
	}
	public void setPart(Parts part) {
		this.part = part;
	}
}
