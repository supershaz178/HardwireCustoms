package com.hrdwire.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.hrdwire.dao.BuildDao;
import com.hrdwire.persistence.Build;
import com.hrdwire.persistence.Customer;


public class BuildDAOImpl implements BuildDao
{
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory; 

	@Override
	@Transactional
	public void create(Build createObj)
	{
		Build build = (Build) createObj;
		getSession().save(build); 
	}

	@Override
	@Transactional
	public void delete(Build deleteObj)
	{
		Build build = (Build) deleteObj; 
		getSession().delete(build);
	}

	@Override
	@Transactional
	public void update(Build updateObj)
	{
		Build build = (Build) updateObj; 
		getSession().saveOrUpdate(build);
	}

	@Override
	@Transactional
	public Build selectById(Integer id)
	{
		return (Build) getSession().get(Build.class, id); 
	}

	@Override
	public Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<Build> searchByCustomer(Customer customer)
	{
		List buildsByCustomer = null; 
		Criteria cr = getSession().createCriteria(Build.class); 
		cr.add(Restrictions.eq("customer", customer)); 
		
		buildsByCustomer = cr.list(); 
		
		return buildsByCustomer;
	}

	@Override
	public List<Build> searchByPatialBuildName(String partialName)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Build> searchByPartId(Integer partId)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Build selectBySerialNumber(Integer serialNumber)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Build selectByFullName(String fullBuildName)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Build selectByTotalCost(Double totalCost)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Build> searchByBuildType(String buildType)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
