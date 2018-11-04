package com.hrdwire.dao;

import java.sql.Date;
import java.util.List;

import com.hrdwire.persistence.Employee;
import com.hrdwire.persistence.Inventory;
import com.hrdwire.persistence.InventoryItem;

public interface InventoryDao extends BaseDao<Inventory>{
	
	public List<Inventory> searchByDateCreated(Date createdOn); 
	
	public List<Inventory> searchByCreatedBy(Employee createdBy); 
	
	public List<Inventory> searchByInventoryItem(InventoryItem item); 
	
	public Inventory selectByReferenceNumber(Integer refNumber); 

}
