package com.hrdwire.dao;

import java.util.List;

import com.hrdwire.persistence.Processor;
import com.hrdwire.persistence.reference.SocketReference;

public interface ProcessorDao extends BaseDao<Processor> {

	public Processor selectByFullName(String fullName);

	public List<Processor> searchByPartialName(String partialName);

	public List<Processor> searchByProcessorType(String processorType);

	public List<Processor> searchBySocketType(SocketReference socketType);

	public List<Processor> searchByBrandName(String brand);

	public List<Processor> searchByOperatingFrequency(Double frequency);

	public List<Processor> searchByNumOfCores(Integer cores);

	public List<Processor> searchByMaxFrequency(Double maxFreq);

	public List<Processor> searchByCache(String cacheL2, String cacheL3);

	public List<Processor> searchByGraphicsDetails(String integratedGraphics,
			Integer baseFreq, Integer maxFreq);

	public List<Processor> searchByMemoryTypeSupported(String memSupport);
}
