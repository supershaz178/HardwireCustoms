package com.hrdwire.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.hrdwire.dao.CaseDao;
import com.hrdwire.persistence.Case;


public class CaseDaoImpl implements CaseDao {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory; 

	@Override
	@Transactional
	public void create(Case createObj)
	{
		getSession().save(createObj); 
	}

	@Override
	@Transactional
	public void delete(Case deleteObj)
	{
		getSession().delete(deleteObj);
	}

	@Override
	@Transactional
	public void update(Case updateObj)
	{
		getSession().saveOrUpdate(updateObj);
	}

	@Override
	@Transactional
	public Case selectById(Integer id)
	{
		return (Case) getSession().get(Case.class, id);
	}

	@Override
	public Session getSession()
	{
		return sessionFactory.getCurrentSession(); 
	}

	@Override
	@Transactional
	public Case searchByFullName(String fullName)
	{
		Criteria cr = getSession().createCriteria(Case.class); 
		cr.add(Restrictions.eq("name", fullName)); 
		Case caseByName = (Case) cr.uniqueResult(); 
		return caseByName;
	}

	@Override
	@Transactional
	public List<Case> searchByPartialName(String partialName)
	{
		Criteria cr = getSession().createCriteria(Case.class); 
		cr.add(Restrictions.like("name", partialName)); 
		List<Case> matchedCases = cr.list(); 
		return matchedCases;
	}

	@Override
	@Transactional
	public List<Case> searchByFormFactor(String formFactor)
	{
		Criteria cr = getSession().createCriteria(Case.class); 
		cr.add(Restrictions.eq("formFactor", formFactor)); 
		List<Case> matchedCases = cr.list(); 
		return matchedCases;
	}

	@Override
	@Transactional
	public List<Case> searchByHeight(Double height)
	{
		Criteria cr = getSession().createCriteria(Case.class); 
		cr.add(Restrictions.eq("height", height)); 
		List<Case> matchedCases = cr.list(); 
		return matchedCases;
	}

	@Override
	@Transactional
	public List<Case> searchByLenght(Double length)
	{
		Criteria cr = getSession().createCriteria(Case.class); 
		cr.add(Restrictions.eq("length", length)); 
		List<Case> matchedCases = cr.list(); 
		return matchedCases;
	}

	@Override
	@Transactional
	public List<Case> searchByWidth(Double width)
	{
		Criteria cr = getSession().createCriteria(Case.class); 
		cr.add(Restrictions.eq("width", width)); 
		List<Case> matchedCases = cr.list(); 
		return matchedCases;
	}

	@Override
	@Transactional
	public List<Case> searchByNumPCISlots(Integer numPCISlots)
	{
		Criteria cr = getSession().createCriteria(Case.class); 
		cr.add(Restrictions.eq("pciSlots", numPCISlots)); 
		List<Case> matchedCases = cr.list(); 
		return matchedCases;
	}

	@Override
	@Transactional
	public List<Case> searchByMaxCoolerHeight(Double height)
	{
		Criteria cr = getSession().createCriteria(Case.class); 
		cr.add(Restrictions.eq("maximumCoolerHeight", height)); 
		List<Case> matchedCases = cr.list(); 
		return matchedCases;
	}

	@Override
	@Transactional
	public List<Case> searchByTotalDimensions(Double height, Double width,
			Double length)
	{
		Criteria cr = getSession().createCriteria(Case.class); 
		
		Criterion heightCriterion = Restrictions.eq("height", height);
		Criterion lengthCriterion = Restrictions.eq("length", length);
		Criterion widthCriterion = Restrictions.eq("width", width);
		
		cr.add(Restrictions.and(heightCriterion, lengthCriterion)).add(widthCriterion); 
		List<Case> matchedCases = cr.list(); 
		
		return matchedCases;
	}

	@Override
	@Transactional
	public List<Case> searchByPartialNameAndFormFactor(String partialName,
			String formFactor)
	{
		Criteria cr = getSession().createCriteria(Case.class); 
		cr.add(Restrictions.like("name", partialName));
		cr.add(Restrictions.eq("formFactor", formFactor));
		List<Case> matchedCases = cr.list(); 
		return matchedCases;
	}

	@Override
	@Transactional
	public List<Case> searchByFormFactorAndNumOfPCISlots(String formFactor,
			Integer numPCISlots)
	{
		Criteria cr = getSession().createCriteria(Case.class); 
		cr.add(Restrictions.eq("formFactor", formFactor));
		cr.add(Restrictions.eq("pciSlots", numPCISlots)); 
		List<Case> matchedCases = cr.list(); 
		return matchedCases;
	}

}
