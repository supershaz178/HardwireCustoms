package com.hrdwire.dao;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.Part;

import com.hrdwire.persistence.Employee;
import com.hrdwire.persistence.Inventory;
import com.hrdwire.persistence.InventoryItem;
import com.hrdwire.persistence.history.InventoryItemHistory;

public interface InventoryItemHistoryDao extends BaseDao<InventoryItemHistory>{
	
	
	public List<InventoryItemHistory> searchByInventoryLine(Inventory line); 
	
	public List<InventoryItemHistory> searchByCreatedBy(Employee emp); 
	
	public List<InventoryItemHistory> searchByCreatedOnDate(Date createdOn); 
	
	public List<InventoryItemHistory> searchByPart(Part part); 
	
	public List<InventoryItemHistory> searchByCreatedOnAndCreatedBy(Employee createdBy, Date createdOn); 

}
