package com.hrdwire.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
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
	@Transactional
	public List<Build> searchByCustomer(Customer customer)
	{
		List<Build> buildsByCustomer = null; 
		Criteria cr = getSession().createCriteria(Build.class); 
		cr.add(Restrictions.eq("customer", customer)); 
		
		buildsByCustomer = cr.list(); 
		
		return buildsByCustomer;
	}

	@Override
	@Transactional
	public List<Build> searchByPatialBuildName(String partialName)
	{
		List<Build> buildsByPartialName = null; 
		Criteria cr = getSession().createCriteria(Build.class); 
		cr.add(Restrictions.ilike("buildName", partialName, MatchMode.ANYWHERE));
		
		buildsByPartialName = cr.list(); 
		
		return buildsByPartialName;
	}

	@Override
	@Transactional
	public List<Build> searchByPartId(Integer partId)
	{
		List<Build> buildByPart = null; 
		Criteria cr = getSession().createCriteria(Build.class); 
		
		cr.add(Restrictions.eq("parts", partId));
		buildByPart = cr.list(); 
		
		return buildByPart;
	}

	@Override
	@Transactional
	public Build selectBySerialNumber(Integer serialNumber)
	{
		Build buildBySerialNum = null; 
		Criteria cr = getSession().createCriteria(Build.class);
		
		cr.add(Restrictions.eq("serialNum", serialNumber)); 
		buildBySerialNum = (Build) cr.uniqueResult();
		
		return buildBySerialNum;
	}

	@Override
	@Transactional
	public Build selectByFullName(String fullBuildName)
	{
		Build buildsByFullName = null; 
		Criteria cr = getSession().createCriteria(Build.class); 
		cr.add(Restrictions.eq("buildName", fullBuildName));
		
		buildsByFullName = (Build) cr.uniqueResult(); 
		
		return buildsByFullName;
	}

	@Override
	@Transactional
	public Build selectByTotalCost(Double totalCost)
	{
		Build buildsByTotalCost = null; 
		Criteria cr = getSession().createCriteria(Build.class); 
		cr.add(Restrictions.eq("buildName", totalCost));
		
		buildsByTotalCost = (Build) cr.uniqueResult(); 
		
		return buildsByTotalCost;
	}

	@Override
	@Transactional
	public List<Build> searchByBuildType(String buildType)
	{
		List<Build> buildByBuildType = null; 
		Criteria cr = getSession().createCriteria(Build.class); 
		
		cr.add(Restrictions.eq("parts", buildType));
		buildByBuildType = cr.list(); 
		
		return buildByBuildType;
	}

	@Override
	@Transactional
	public List<Build> searchByStatus(String buildStatus)
	{
		List<Build> buildByBuildStatus = null; 
		Criteria cr = getSession().createCriteria(Build.class); 
		
		cr.add(Restrictions.eq("parts", buildStatus));
		buildByBuildStatus = cr.list(); 
		
		return buildByBuildStatus;
	}

	@Override
	public Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
}
