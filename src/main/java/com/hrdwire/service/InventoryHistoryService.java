package com.hrdwire.service;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

import com.hrdwire.persistence.Inventory;
import com.hrdwire.persistence.history.InventoryHistory;

public interface InventoryHistoryService extends BaseService<InventoryHistory>
{
	public Date createTransferDate(InventoryHistory transferRecord); 
	
	public List<InventoryHistory> searchByParmeters(HashMap<String,String> parmeters);
	
	public List<InventoryHistory> createTransferList(List<Inventory> transferringList); 
	
	public InventoryHistory createSingleTransfer(Inventory singleTrans); 
	
	public InventoryHistory historyAudit(List<InventoryHistory> auditList, Date beginDate, Date endDate); 
	
	public List<InventoryHistory> listAllInventoryHistory(); 
}
