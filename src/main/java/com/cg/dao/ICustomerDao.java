package com.cg.dao;

import com.cg.entites.Customer;

public interface ICustomerDao {
	public Customer add(Customer customer);
	public Customer findById(Long customerID);
	public Customer update(Customer customer);
}
