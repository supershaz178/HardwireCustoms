package com.hrdwire.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.hrdwire.dao.BuildDao;
import com.hrdwire.persistence.Build;


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
	public void delete(Build deleteObj)
	{
		Build build = (Build) deleteObj; 
		getSession().delete(build);
	}

	@Override
	public void update(Build updateObj)
	{
		Build build = (Build) updateObj; 
		getSession().saveOrUpdate(build);
	}

	@Override
	public Build selectById(Integer id)
	{
		return (Build) getSession().get(Build.class, id); 
	}

	@Override
	public Session getSession()
	{
		sessionFactory.getCurrentSession(); 
		return null;
	}

}
