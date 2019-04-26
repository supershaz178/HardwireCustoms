package com.hrdwire.dao;

import java.sql.Date;
import java.util.List;

import com.hrdwire.persistence.Employee;
import com.hrdwire.persistence.Inventory;
import com.hrdwire.persistence.InventoryItem;
import com.hrdwire.persistence.Parts;

public interface InventoryItemDao extends BaseDao<InventoryItem> {

	public List<InventoryItem> searchByInventoryLine(Inventory line);

	public List<InventoryItem> searchByCreatedBy(Employee emp);

	public List<InventoryItem> searchByCreatedOnDate(Date createdOn);

	public InventoryItem selectByPart(Parts part);

	public List<InventoryItem> searchByCreatedOnAndCreatedBy(
			Employee createdBy, Date createdOn);

}
