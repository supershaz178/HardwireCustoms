package com.hrdwire.service;

import java.util.HashMap;
import java.util.List;

import com.hrdwire.persistence.Build;
import com.hrdwire.persistence.Memory;

public interface MemoryService extends BaseService<Memory> {

	public Memory updateMemoryModuleDetails(Integer memId);

	public Boolean isSetofModules(Memory memSet);

	public Build addModuleToBuild(Memory mem);

	public Build installPartialSet(Memory mem, Integer numOfModules);

	public Build removeModuleFromBuild(Memory mem);

	public List<Memory> searchByParmeters(HashMap<String, String> parmeters);

	public String determineType(Memory memType);

	public List<Memory> listAllModules();

}
