package com.hrdwire.dao;

import java.util.List;

import com.hrdwire.persistence.Employee;

public interface EmployeeDao extends BaseDao<Employee>
{
	public Employee selectByUserName(String userName);
	
	public Employee selectByEmail(String emailAddress); 
	
	public Employee selectByPersonSerialNumber(Integer personNumber); 
	
	public List<Employee> searchByFirstName(String firstName); 
	
	public List<Employee> searchByLastName(String lastName); 
	
	public List<Employee> searchByStatus(String status); 
	
	public List<Employee> searchByEmailAddress(String email); 
	
	public List<Employee> searchByZipCode(Integer zipCode);
}
