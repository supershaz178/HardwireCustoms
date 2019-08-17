package com.hrdwire.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.hrdwire.dao.CoolingDeviceDao;
import com.hrdwire.persistence.CoolingDevice;


public class CoolingDeviceDaoImpl implements CoolingDeviceDao {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory; 

	@Override
	@Transactional
	public void create(CoolingDevice createObj)
	{
		getSession().save(createObj); 
	}

	@Override
	@Transactional
	public void delete(CoolingDevice deleteObj)
	{
		getSession().save(deleteObj); 
	}

	@Override
	@Transactional
	public void update(CoolingDevice updateObj)
	{
		getSession().saveOrUpdate(updateObj);

	}

	@Override
	@Transactional
	public CoolingDevice selectById(Integer id)
	{
		return (CoolingDevice) getSession().get(CoolingDevice.class, id);  		
	}

	@Override
	public Session getSession()
	{
		return sessionFactory.getCurrentSession(); 
	}

	@Override
	@Transactional
	public CoolingDevice selectByFullName(String fullName)
	{
		Criteria cr = getSession().createCriteria(CoolingDevice.class); 
		cr.add(Restrictions.eq("name", fullName)); 
		CoolingDevice matchedDevice = (CoolingDevice) cr.uniqueResult(); 
		return matchedDevice;
	}

	@Override
	@Transactional
	public List<CoolingDevice> searchByFanRadius(Integer radius)
	{
		Criteria cr = getSession().createCriteria(CoolingDevice.class); 
		cr.add(Restrictions.eq("fanRadius", radius)); 
		List<CoolingDevice> matchedDevices = cr.list(); 
		return matchedDevices;
	}

	@Override
	@Transactional
	public List<CoolingDevice> searchByPartialName(String partialName)
	{
		Criteria cr = getSession().createCriteria(CoolingDevice.class); 
		cr.add(Restrictions.like("name", partialName)); 
		List<CoolingDevice> matchedDevices = cr.list(); 
		return matchedDevices;
	}

	@Override
	@Transactional
	public List<CoolingDevice> searchByFanSpeed(Integer fanSpeed)
	{
		Criteria cr = getSession().createCriteria(CoolingDevice.class); 
		cr.add(Restrictions.eq("fanSpeed", fanSpeed)); 
		List<CoolingDevice> matchedDevices = cr.list(); 
		return matchedDevices;
	}

	@Override
	@Transactional
	public List<CoolingDevice> searchByDeviceColor(String color)
	{
		Criteria cr = getSession().createCriteria(CoolingDevice.class); 
		cr.add(Restrictions.eq("deviceColor", color)); 
		List<CoolingDevice> matchedDevices = cr.list(); 
		return matchedDevices;
	}

	@Override
	@Transactional
	public List<CoolingDevice> searchByBaseColor(String color)
	{
		Criteria cr = getSession().createCriteria(CoolingDevice.class); 
		cr.add(Restrictions.eq("baseColor", color)); 
		List<CoolingDevice> matchedDevices = cr.list(); 
		return matchedDevices;
	}

	@Override
	@Transactional
	public List<CoolingDevice> searchByAirFlow(Double AirFlow)
	{
		Criteria cr = getSession().createCriteria(CoolingDevice.class); 
		cr.add(Restrictions.eq("airFlow", AirFlow)); 
		List<CoolingDevice> matchedDevices = cr.list(); 
		return matchedDevices;
	}

	@Override
	@Transactional
	public List<CoolingDevice> searchByDeviceType(String deviceType)
	{
		Criteria cr = getSession().createCriteria(CoolingDevice.class); 
		cr.add(Restrictions.eq("deviceType", deviceType)); 
		List<CoolingDevice> matchedDevices = cr.list(); 
		return matchedDevices;
	}

	@Override
	@Transactional
	public List<CoolingDevice> searchByFanRadiusAndSpeed(Integer fanSpeed,
			Integer radius)
	{
		Criteria cr = getSession().createCriteria(CoolingDevice.class); 
		cr.add(Restrictions.eq("fanRadius", radius));
		cr.add(Restrictions.eq("fanSpeed", fanSpeed));
		List<CoolingDevice> matchedDevices = cr.list(); 
		return matchedDevices;
	}

	@Override
	@Transactional
	public List<CoolingDevice> searchByLiquidCoolerTypeProperties(
			Integer fanSlots, Integer tubeLength)
	{
		Criteria cr = getSession().createCriteria(CoolingDevice.class); 
		cr.add(Restrictions.eq("fanSlots", fanSlots));
		cr.add(Restrictions.eq("tubeLength", tubeLength));
		List<CoolingDevice> matchedDevices = cr.list(); 
		return matchedDevices;
	}

}
