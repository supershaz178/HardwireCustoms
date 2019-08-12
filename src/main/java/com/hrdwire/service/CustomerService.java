package com.hrdwire.service;

import java.sql.Date;
import java.util.List;

import com.hrdwire.persistence.Build;
import com.hrdwire.persistence.Customer;

public interface CustomerService extends BaseService<Customer> {

	public void assignCustNumber(Customer customer);

	public Customer createCustomerAccount();

	public Customer fetchCustByBuild(Build custBuild);

	public Customer payForBuild(Customer customer);

	public Build requestBuild(Customer requestCust);

	public void cancelBuild(Customer build);

	public List<Build> listAllOwnedBuilds(Customer customer);

	public List<Customer> listAllCustomersFromDay(Date date);

	public Customer editPersonalInfo(Customer customer);

	public List<Customer> listAllCustomers();

}
