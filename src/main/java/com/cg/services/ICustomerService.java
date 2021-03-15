package com.cg.services;

import com.cg.entites.Customer;

public interface ICustomerService {
	public Customer findById(long customerID);
	public Customer createCustomer(String name);
    public Customer addAmount(Long id,double amount);
 
}
