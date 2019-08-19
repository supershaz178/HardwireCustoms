package com.hrdwire.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.hrdwire.dao.GraphicsCardDao;
import com.hrdwire.persistence.GraphicsCard;


public class GraphicsCardDaoImpl implements GraphicsCardDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory; 
	
	@Override
	@Transactional
	public void create(GraphicsCard createObj)
	{
		getSession().save(createObj); 
	}

	@Override
	@Transactional
	public void delete(GraphicsCard deleteObj)
	{
		getSession().delete(deleteObj);
	}

	@Override
	@Transactional
	public void update(GraphicsCard updateObj)
	{
		getSession().saveOrUpdate(updateObj);
	}

	@Override
	@Transactional
	public GraphicsCard selectById(Integer id)
	{
		GraphicsCard gc = (GraphicsCard) getSession().get(GraphicsCard.class, id); 
		return gc;
	}

	@Override
	public Session getSession()
	{
		return sessionFactory.getCurrentSession(); 
	}

	@Override
	@Transactional
	public GraphicsCard searchByFullName(String fullName)
	{
		Criteria cr = getSession().createCriteria(GraphicsCard.class); 
		cr.add(Restrictions.eq("name", fullName));
		GraphicsCard gc = (GraphicsCard)cr.uniqueResult();  
		return gc;
	}

	@Override
	@Transactional
	public List<GraphicsCard> searchByPartialName(String partialName)
	{
		Criteria cr = getSession().createCriteria(GraphicsCard.class); 
		cr.add(Restrictions.like("name", partialName));
		List<GraphicsCard> matchedGraphicsCards = cr.list(); 
		return matchedGraphicsCards;
	}

	@Override
	@Transactional
	public List<GraphicsCard> searchByInterfaceType(String interfaceType)
	{
		Criteria cr = getSession().createCriteria(GraphicsCard.class); 
		cr.add(Restrictions.eq("interfaceType", interfaceType));
		List<GraphicsCard> matchedGraphicsCards = cr.list(); 
		return matchedGraphicsCards;
	}

	@Override
	@Transactional
	public List<GraphicsCard> searchByNumberOfCudaCores(Integer numberOfCores)
	{
		Criteria cr = getSession().createCriteria(GraphicsCard.class); 
		cr.add(Restrictions.eq("cudaCores", numberOfCores));
		List<GraphicsCard> matchedGraphicsCards = cr.list(); 
		return matchedGraphicsCards;
	}

	@Override
	@Transactional
	public List<GraphicsCard> searchByCoreClockSpeed(Double coreSpeed)
	{
		Criteria cr = getSession().createCriteria(GraphicsCard.class); 
		cr.add(Restrictions.eq("coreClockSpeed", coreSpeed));
		List<GraphicsCard> matchedGraphicsCards = cr.list(); 
		return matchedGraphicsCards;
	}

	@Override
	@Transactional
	public List<GraphicsCard> searchByBoostedClockSpeed(Double boostedSpeed)
	{
		Criteria cr = getSession().createCriteria(GraphicsCard.class); 
		cr.add(Restrictions.eq("boostClockSpeed", boostedSpeed));
		List<GraphicsCard> matchedGraphicsCards = cr.list(); 
		return matchedGraphicsCards;
	}

	@Override
	@Transactional
	public List<GraphicsCard> searchByMemoryCapacity(Integer capacity)
	{
		Criteria cr = getSession().createCriteria(GraphicsCard.class); 
		cr.add(Restrictions.eq("memCapacity", capacity));
		List<GraphicsCard> matchedGraphicsCards = cr.list(); 
		return matchedGraphicsCards;
	}

	@Override
	@Transactional
	public List<GraphicsCard> searchByMemoryType(String memType)
	{
		Criteria cr = getSession().createCriteria(GraphicsCard.class); 
		cr.add(Restrictions.eq("memType", memType));
		List<GraphicsCard> matchedGraphicsCards = cr.list(); 
		return matchedGraphicsCards;
	}

	@Override
	@Transactional
	public List<GraphicsCard> searchByMaxResolution(String maxRes)
	{
		Criteria cr = getSession().createCriteria(GraphicsCard.class); 
		cr.add(Restrictions.eq("maxResolution", maxRes));
		List<GraphicsCard> matchedGraphicsCards = cr.list(); 
		return matchedGraphicsCards;
	}

	@Override
	@Transactional
	public List<GraphicsCard> searchByDirectXVersion(Integer version)
	{
		Criteria cr = getSession().createCriteria(GraphicsCard.class); 
		cr.add(Restrictions.eq("directXVersion", version));
		List<GraphicsCard> matchedGraphicsCards = cr.list(); 
		return matchedGraphicsCards;
	}

	@Override
	@Transactional
	public List<GraphicsCard> searchByCoreClockSpeedDetails(Double coreSpeed,
			Double boostedSpeed)
	{
		Criteria cr = getSession().createCriteria(GraphicsCard.class); 
		cr.add(Restrictions.eq("coreClockSpeed", coreSpeed));
		cr.add(Restrictions.eq("boostClockSpeed", boostedSpeed));
		List<GraphicsCard> matchedGraphicsCards = cr.list(); 
		return matchedGraphicsCards;
	}

	@Override
	@Transactional
	public List<GraphicsCard> searchByMemoryDetails(Integer capacity,
			String type)
	{
		Criteria cr = getSession().createCriteria(GraphicsCard.class); 
		cr.add(Restrictions.eq("memCapacity", capacity));
		cr.add(Restrictions.eq("memType", type));
		List<GraphicsCard> matchedGraphicsCards = cr.list(); 
		return matchedGraphicsCards;
	}

	@Override
	@Transactional
	public List<GraphicsCard> searchByDisplayDetails(String maxRes,
			Integer directXVersion)
	{
		Criteria cr = getSession().createCriteria(GraphicsCard.class); 
		cr.add(Restrictions.eq("directXVersion", directXVersion));
		cr.add(Restrictions.eq("maxResolution", maxRes));
		List<GraphicsCard> matchedGraphicsCards = cr.list(); 
		return matchedGraphicsCards;
	}
}
