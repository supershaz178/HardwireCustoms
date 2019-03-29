package com.hrdwire.service;

import java.util.HashMap;
import java.util.List;

import com.hrdwire.persistence.Case;
import com.hrdwire.persistence.Motherboard;
import com.hrdwire.persistence.Parts;

public interface MotherboardService extends BaseService<Motherboard>
{
	public List<Motherboard> searchByParameters(HashMap<String,String> parameters);
	
	public Motherboard determineCompatibility(List<Parts> partsList); 
	
	public Boolean isChipsetInstalled(Motherboard isInstalled); 
	
	public Boolean isMotherboardFitCase(Motherboard board, Case installedCase); 
	
	public Boolean isMaxMemoryLimitReached(Motherboard board); 
	
	public Boolean isRaidSupported(Motherboard isRaid); 
	
	public Integer numberOfPCISlotsUsed(List<Parts> partsList);
	
	public List<Parts> replaceMotherboard(List<Parts> partsList, Motherboard newMotherboard); 
	
	public List<Parts> replacePart(List<Parts> partsList, Parts newPart);
	
	public List<Motherboard> listAllMotherboards(); 

}
