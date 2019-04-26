package com.hrdwire.dao;

import java.util.List;

import com.hrdwire.persistence.Motherboard;
import com.hrdwire.persistence.reference.SocketReference;

public interface MotherboardDao extends BaseDao<Motherboard> {

	public Motherboard selectByFullName(String fullName);

	public List<Motherboard> searchByPartialName(String partialName);

	public List<Motherboard> searchByFormFactor(String formFactor);

	public List<Motherboard> searchBySocketType(SocketReference socket);

	public List<Motherboard> searchByMemStandard(String memoryStan);

	public List<Motherboard> searchByMemoryMaxSpeed(String speed);

	public List<Motherboard> searchByMaxMemory(Integer amountOfMemory);

	public List<Motherboard> searchByPCIExpressSlots(Integer numberOfSlots);

	public List<Motherboard> searchByNumberOfSATASlots(Integer numberofSlots);

	public List<Motherboard> searchByNumberOfAddUSBSlots(Integer numberOfSlots);

	public List<Motherboard> searchByFormFactorAndSocketType(String formFactor,
			SocketReference socket);

	public List<Motherboard> searchByMaxMemoryAndMaxSpeed(
			Integer amountOfMemory, Integer maxSpeed);

	public List<Motherboard> searchByPartialNameAndFormFactor(
			String partialName, String formFactor);
}
