package com.hrdwire.service;

import java.util.HashMap;
import java.util.List;

import com.hrdwire.persistence.Inventory;
import com.hrdwire.persistence.InventoryItem;
import com.hrdwire.persistence.Parts;
import com.hrdwire.persistence.history.InventoryHistory;

public interface InventoryService extends BaseService<Inventory> {

	public String createReferenceNumber();

	public Inventory createInventoryList(List<Parts> inventoryItemChanges);

	public List<Inventory> searchByParmeters(HashMap<String, String> parameters);

	public Inventory addInventoryItem(Inventory modifyEntry,
			InventoryItem addItem);

	public Inventory modifyInventory(Inventory modifyEntry);

	public Inventory modifyInventoryItem(Inventory modifyEntry,
			InventoryItem modifyItem);

	public InventoryHistory transferRecordToHistTable(Inventory inventoryEntry);

	public Inventory calculateNumberOfPartsTotal(Inventory calculateParts);

	public Inventory listCurrentInventory();

	public List<Inventory> listAllInventory();

}
