package com.hrdwire.dao;

import java.sql.Date;
import java.util.List;

import com.hrdwire.persistence.Employee;
import com.hrdwire.persistence.InventoryItem;
import com.hrdwire.persistence.history.InventoryHistory;

public interface InventoryHistoryDao extends BaseDao<InventoryHistory> {

	public List<InventoryHistory> searchByDateCreated(Date createdOn);

	public List<InventoryHistory> searchByCreatedBy(Employee createdBy);

	public List<InventoryHistory> searchByInventoryItem(InventoryItem item);

	public InventoryHistory selectByReferenceNumber(Integer refNumber);

	public Boolean insertTransferredRecords(
			List<InventoryHistory> transferRecords);

	public List<InventoryHistory> searchByDateAndCreatedBy(Date createdOn,
			Employee createdBy);

	public List<InventoryHistory> searchByInventoryItemAndDate(
			InventoryItem item, Date createdOn);

}
