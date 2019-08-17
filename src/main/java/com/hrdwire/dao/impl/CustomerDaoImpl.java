package com.hrdwire.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.hrdwire.dao.CustomerDao;
import com.hrdwire.persistence.Build;
import com.hrdwire.persistence.Customer;
import com.hrdwire.persistence.reference.RoleReference;


public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory; 
	
	@Override
	@Transactional
	public void create(Customer createObj)
	{
		getSession().save(createObj); 
	}

	@Override
	@Transactional
	public void delete(Customer deleteObj)
	{
		getSession().delete(deleteObj);
	}

	@Override
	@Transactional
	public void update(Customer updateObj)
	{
		getSession().saveOrUpdate(updateObj); 
	}

	@Override
	@Transactional
	public Customer selectById(Integer id)
	{
		return (Customer) getSession().get(Customer.class, id); 
	}

	@Override
	public Session getSession()
	{
		return sessionFactory.getCurrentSession(); 
	}

	@Override
	@Transactional
	public Customer selectCustomerByPersonNumber(Integer persNumber)
	{
		Criteria cr = getSession().createCriteria(Build.class);
		cr.add(Restrictions.eq("personNumber", persNumber));
		Customer cust = (Customer)cr.uniqueResult();
		return cust;
	}

	@Override
	@Transactional
	public Customer selectCustomerByBuild(Build build)
	{
		Criteria cr = getSession().createCriteria(Build.class);
		cr.add(Restrictions.eq("builds", build));
		Customer cust = (Customer)cr.uniqueResult();
		return cust;
	}

	@Override
	@Transactional
	public Customer selectCustomerByPhoneNumber(Integer phoneNum)
	{
		Criteria cr = getSession().createCriteria(Build.class);
		cr.add(Restrictions.eq("phoneNumber", phoneNum));
		Customer cust = (Customer)cr.uniqueResult();
		return cust;
	}

	@Override
	@Transactional
	public List<Customer> searchCustomerByRole(RoleReference role)
	{
		Criteria cr = getSession().createCriteria(Build.class);
		cr.add(Restrictions.eq("role", role));
		List<Customer> cust = cr.list();
		return cust;
	}

	@Override
	@Transactional
	public List<Customer> searchCustomerByFirstName(String firstName)
	{
		Criteria cr = getSession().createCriteria(Build.class);
		cr.add(Restrictions.eq("firstName", firstName));
		List<Customer> cust = cr.list();
		return cust;
	}

	@Override
	@Transactional
	public List<Customer> searchCustomerByLastName(String lastName)
	{
		Criteria cr = getSession().createCriteria(Build.class);
		cr.add(Restrictions.eq("lastName", lastName));
		List<Customer> cust = cr.list();
		return cust;
	}

	@Override
	public List<Customer> searchCustomerByFullName(String firstName,
			String lastName)
	{
		Criteria cr = getSession().createCriteria(Build.class);
		cr.add(Restrictions.eq("firstName", firstName));
		cr.add(Restrictions.eq("lastName", lastName));
		List<Customer> cust = cr.list();
		return cust;
	}

}
