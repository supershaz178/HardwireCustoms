package com.hrdwire.service;

import java.util.HashMap;
import java.util.List;

import com.hrdwire.persistence.InventoryItem;
import com.hrdwire.persistence.Parts;
import com.hrdwire.persistence.history.InventoryItemHistory;

public interface InventoryItemService extends BaseService<InventoryItem> {

	public InventoryItemHistory transferInventoryItem(InventoryItem transferItem);

	public List<InventoryItem> searchByParameters(
			HashMap<String, String> parameters);

	public InventoryItem searchByPartId(Integer partId);

	public List<InventoryItem> createListForInventoryEntry(
			List<Parts> changedInventory);

	public InventoryItem createNewInventoryItem(Parts newPart);

	public void removeInventoryItemByPart(Integer partId);

}
