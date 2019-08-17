package com.hrdwire.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.hrdwire.dao.EmployeeDao;
import com.hrdwire.persistence.Build;
import com.hrdwire.persistence.Employee;


public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory; 
	
	@Override
	@Transactional
	public void create(Employee createObj)
	{
		getSession().save(createObj); 
	}

	@Override
	@Transactional
	public void delete(Employee deleteObj)
	{
		getSession().delete(deleteObj);
	}

	@Override
	@Transactional
	public void update(Employee updateObj)
	{
		getSession().saveOrUpdate(updateObj);
	}

	@Override
	@Transactional
	public Employee selectById(Integer id)
	{
		return (Employee) getSession().get(Employee.class, id);
	}

	@Override
	public Session getSession()
	{
		return sessionFactory.getCurrentSession(); 
	}

	@Override
	@Transactional
	public Employee selectByUserName(String userName)
	{
		Criteria cr = getSession().createCriteria(Employee.class); 
		cr.add(Restrictions.eq("userName", userName));
		Employee emp = (Employee) cr.uniqueResult(); 		
		return emp;
	}

	@Override
	@Transactional
	public Employee selectByEmail(String emailAddress)
	{
		Criteria cr = getSession().createCriteria(Employee.class); 
		cr.add(Restrictions.eq("email", emailAddress));
		Employee emp = (Employee) cr.uniqueResult(); 		
		return emp;
	}

	@Override
	@Transactional
	public Employee selectByPersonSerialNumber(Integer personNumber)
	{
		Criteria cr = getSession().createCriteria(Employee.class); 
		cr.add(Restrictions.eq("personNumber", personNumber));
		Employee emp = (Employee) cr.uniqueResult(); 		
		return emp;
	}

	@Override
	@Transactional
	public Employee selectByPhoneNumber(Integer phoneNumber)
	{
		Criteria cr = getSession().createCriteria(Employee.class); 
		cr.add(Restrictions.eq("phoneNumber", phoneNumber));
		Employee emp = (Employee) cr.uniqueResult(); 		
		return emp;
	}

	@Override
	@Transactional
	public List<Employee> searchByFirstName(String firstName)
	{
		Criteria cr = getSession().createCriteria(Employee.class); 
		cr.add(Restrictions.eq("firstName", firstName));
		List<Employee> matchedEmployees = cr.list(); 		
		return matchedEmployees;
	}

	@Override
	@Transactional
	public List<Employee> searchByLastName(String lastName)
	{
		Criteria cr = getSession().createCriteria(Employee.class); 
		cr.add(Restrictions.eq("lastName", lastName));
		List<Employee> matchedEmployees = cr.list(); 		
		return matchedEmployees;
	}

	@Override
	@Transactional
	public List<Employee> searchByStatus(String status)
	{
		Criteria cr = getSession().createCriteria(Employee.class); 
		cr.add(Restrictions.eq("status", status));
		List<Employee> matchedEmployees = cr.list(); 		
		return matchedEmployees;
	}

	@Override
	@Transactional
	public List<Employee> searchByZipCode(Integer zipCode)
	{
		Criteria cr = getSession().createCriteria(Employee.class); 
		cr.add(Restrictions.eq("zipCode", zipCode));
		List<Employee> matchedEmployees = cr.list(); 		
		return matchedEmployees;
	}

	@Override
	@Transactional
	public List<Employee> searchByPhysicalAddr(String addrLine1,
			String addrLine2, String state, String city, String zipCode)
	{
		Criteria cr = getSession().createCriteria(Employee.class); 
		cr.add(Restrictions.eq("address_1", addrLine1));
		cr.add(Restrictions.eq("address_2", addrLine2));
		cr.add(Restrictions.eq("state", state));
		cr.add(Restrictions.eq("city", city));
		cr.add(Restrictions.eq("zipCode", zipCode));
		List<Employee> matchedEmployees = cr.list(); 		
		return matchedEmployees;
	}

	@Override
	@Transactional
	public List<Employee> searchByFirstAndLastName(String firstName,
			String lastName)
	{
		Criteria cr = getSession().createCriteria(Employee.class); 
		cr.add(Restrictions.eq("firstName", firstName));
		cr.add(Restrictions.eq("lastName", lastName));
		List<Employee> matchedEmployees = cr.list(); 		
		return matchedEmployees;
	}

	@Override
	@Transactional
	public List<Employee> searchByCityAndZipCode(String city, Integer zipCode)
	{
		Criteria cr = getSession().createCriteria(Employee.class); 
		cr.add(Restrictions.eq("city", city));
		cr.add(Restrictions.eq("zipCode", zipCode));
		List<Employee> matchedEmployees = cr.list(); 		
		return matchedEmployees;
	}

}
