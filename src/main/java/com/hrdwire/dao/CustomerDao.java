package com.hrdwire.dao;

import java.util.List;

import com.hrdwire.persistence.Build;
import com.hrdwire.persistence.Customer;
import com.hrdwire.persistence.reference.RoleReference;

public interface CustomerDao extends BaseDao<Customer> {

	public Customer selectCustomerByPersonNumber(Integer persNumber);

	public Customer selectCustomerByBuild(Build build);

	public Customer selectCustomerByPhoneNumber(Integer phoneNum);

	public List<Customer> searchCustomerByRole(RoleReference role);

	public List<Customer> searchCustomerByFirstName(String firstName);

	public List<Customer> searchCustomerByLastName(String lastName);
	
	public List<Customer> searchCustomerByFullName(String firstName, String lastName); 

}
