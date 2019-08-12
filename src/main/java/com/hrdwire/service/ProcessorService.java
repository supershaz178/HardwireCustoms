package com.hrdwire.service;

import java.util.List;
import java.util.Map;

import com.hrdwire.persistence.Motherboard;
import com.hrdwire.persistence.Processor;

public interface ProcessorService extends BaseService<Processor> {

	public List<Processor> searchByParameters(Map<String, String> parmeters);

	public Boolean isCompatibleWithMoherBoard(Motherboard motherBoardCheck);

	public Boolean isGraphicsIntegreated(Processor proc);

	public Boolean isOverclockable(Processor proc);

	public List<Processor> listAllProcessors();
}
