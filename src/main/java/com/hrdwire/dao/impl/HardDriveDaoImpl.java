package com.hrdwire.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.hrdwire.dao.HardDriveDao;
import com.hrdwire.persistence.HardDrive;


public class HardDriveDaoImpl implements HardDriveDao {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory; 

	@Override
	@Transactional
	public void create(HardDrive createObj)
	{
		getSession().save(createObj); 
	}

	@Override
	@Transactional
	public void delete(HardDrive deleteObj)
	{
		getSession().delete(deleteObj);
	}

	@Override
	@Transactional
	public void update(HardDrive updateObj)
	{
		getSession().saveOrUpdate(updateObj);
	}

	@Override
	@Transactional
	public HardDrive selectById(Integer id)
	{
		return (HardDrive)getSession().get(HardDrive.class, id);
	}

	@Override
	public Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}

	@Override
	@Transactional
	public HardDrive selectByFullName(String hardDriveName)
	{
		Criteria cr = getSession().createCriteria(HardDrive.class); 
		cr.add(Restrictions.eq("name", hardDriveName));
		HardDrive selectedHD = (HardDrive)cr.uniqueResult(); 
		return selectedHD;
	}

	@Override
	@Transactional
	public List<HardDrive> searchByPartialName(String partialName)
	{
		Criteria cr = getSession().createCriteria(HardDrive.class); 
		cr.add(Restrictions.like("name", partialName));
		List<HardDrive> selectedHDs = cr.list(); 
		return selectedHDs;
	}

	@Override
	@Transactional
	public List<HardDrive> searchBySeriesName(String seriesName)
	{
		Criteria cr = getSession().createCriteria(HardDrive.class); 
		cr.add(Restrictions.eq("series", seriesName));
		List<HardDrive> selectedHDs = cr.list(); 
		return selectedHDs;
	}

	@Override
	@Transactional
	public List<HardDrive> searchByBrandName(String brandName)
	{
		Criteria cr = getSession().createCriteria(HardDrive.class); 
		cr.add(Restrictions.eq("brand", brandName));
		List<HardDrive> selectedHDs = cr.list(); 
		return selectedHDs;
	}

	@Override
	@Transactional
	public List<HardDrive> searchByRatings(Integer rating)
	{
		Criteria cr = getSession().createCriteria(HardDrive.class); 
		cr.add(Restrictions.eq("rating", rating));
		List<HardDrive> selectedHDs = cr.list(); 
		return selectedHDs;
	}

	@Override
	@Transactional
	public List<HardDrive> searchByCapacity(Integer capacity)
	{
		Criteria cr = getSession().createCriteria(HardDrive.class); 
		cr.add(Restrictions.eq("capacity", capacity));
		List<HardDrive> selectedHDs = cr.list(); 
		return selectedHDs;
	}

	@Override
	@Transactional
	public List<HardDrive> searchByFormFactor(Double formFactor)
	{
		Criteria cr = getSession().createCriteria(HardDrive.class); 
		cr.add(Restrictions.eq("formFactor", formFactor));
		List<HardDrive> selectedHDs = cr.list(); 
		return selectedHDs;
	}

	@Override
	@Transactional
	public List<HardDrive> searchByRPM(Integer rpm)
	{
		Criteria cr = getSession().createCriteria(HardDrive.class); 
		cr.add(Restrictions.eq("rpm", rpm));
		List<HardDrive> selectedHDs = cr.list(); 
		return selectedHDs;
	}

	@Override
	@Transactional
	public List<HardDrive> searchByInterfaceType(String InterfaceType)
	{
		Criteria cr = getSession().createCriteria(HardDrive.class); 
		cr.add(Restrictions.eq("interfaceType", InterfaceType));
		List<HardDrive> selectedHDs = cr.list(); 
		return selectedHDs;
	}

	@Override
	@Transactional
	public List<HardDrive> searchByCapacityAndRPM(Integer capacity, Integer rpm)
	{
		Criteria cr = getSession().createCriteria(HardDrive.class); 
		cr.add(Restrictions.eq("capacity", capacity));
		cr.add(Restrictions.eq("rpm", rpm)); 
		List<HardDrive> selectedHDs = cr.list(); 
		return selectedHDs;
	}

	@Override
	@Transactional
	public List<HardDrive> searchByPartialNameAndBrandAndSeries(
			String partialName, String brand, String series)
	{
		Criteria cr = getSession().createCriteria(HardDrive.class); 
		cr.add(Restrictions.like("name", partialName));
		cr.add(Restrictions.eq("series", series)); 
		cr.add(Restrictions.eq("brand", brand)); 
		List<HardDrive> selectedHDs = cr.list(); 
		return selectedHDs;
	}

	@Override
	@Transactional
	public List<HardDrive> searchByCapacityAndFormFactor(Integer capacity,
			Double formFactor)
	{
		Criteria cr = getSession().createCriteria(HardDrive.class); 
		cr.add(Restrictions.eq("capacity", capacity));
		cr.add(Restrictions.eq("formFactor", formFactor));
		List<HardDrive> selectedHDs = cr.list(); 
		return selectedHDs;
	}

}
