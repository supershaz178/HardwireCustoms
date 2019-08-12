package com.hrdwire.service;

import java.util.HashMap;
import java.util.List;

import com.hrdwire.persistence.Build;
import com.hrdwire.persistence.Customer;
import com.hrdwire.persistence.Employee;

public interface EmployeeService extends BaseService<Employee> {

	public Employee createEmployeeAccount(Employee newEmp);

	public Employee assignBuild(Build build);

	public Employee changeAssignment(Build build);

	public Employee assignCustomerService(Customer cust);

	public void updateProfile(Employee employee);

	public void updateSecurePassword(Employee employee, String pwd);

	public Employee updateEmployeeStatus(Employee employee, String newStatus);

	public List<Employee> searchEmployee(HashMap<String, String> parameters);
}
