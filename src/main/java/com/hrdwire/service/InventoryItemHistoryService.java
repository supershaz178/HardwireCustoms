package com.hrdwire.service;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

import com.hrdwire.persistence.Inventory;
import com.hrdwire.persistence.InventoryItem;
import com.hrdwire.persistence.history.InventoryItemHistory;

public interface InventoryItemHistoryService extends BaseService<InventoryItemHistory>
{
	public List<InventoryItem> createInventoryItemsList(Inventory inventoryEntry); 
	
	public List<InventoryItemHistory> searchByParameters (HashMap<String,String> parameters); 
	
	public List<InventoryItemHistory> createItemAuditList(List<InventoryItemHistory> auditItems, Date beginDate, Date endDate);
	
	public Boolean checkCreateByDate(InventoryItemHistory checkEntry); 
	
	public List<InventoryItemHistory> listAllInventoryItemHistory(); 
	
	public void removeInventoryItemHistory(List<InventoryItemHistory> removeItemHistory); 
}
