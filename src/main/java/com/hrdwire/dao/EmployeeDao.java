package com.hrdwire.dao;

import java.util.List;

import com.hrdwire.persistence.Build;
import com.hrdwire.persistence.Employee;

public interface EmployeeDao extends BaseDao<Employee> {

	public Employee selectByUserName(String userName);

	public Employee selectByEmail(String emailAddress);

	public Employee selectByPersonSerialNumber(Integer personNumber);

	public Employee selectByPhoneNumber(Integer phoneNumber);

	public List<Employee> searchByFirstName(String firstName);

	public List<Employee> searchByLastName(String lastName);

	public List<Employee> searchByStatus(String status);

	public List<Employee> searchByZipCode(Integer zipCode);

	public List<Employee> searchByPhysicalAddr(String addrLine1,
			String addrLine2, String state, String city, String zipCode);

	public List<Employee> searchByFirstAndLastName(String firstName,
			String lastName);

	public List<Employee> searchByCityAndZipCode(String city, Integer zipCode);

}
