package com.cg.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.entites.Account;
import com.cg.entites.Customer;
import com.cg.services.CustomerServiceImp;
import com.cg.services.ICustomerService;

@Component
public class CustomerUI {

	@Autowired
	ICustomerService services;

	@Autowired
	CustomerServiceImp service;

	public void start() {

		Customer pranav = service.createCustomer("Pranav");
		display(pranav);

		Customer daksh = service.createCustomer("Daksh");
		display(daksh);

		System.out.println("Customer with id 4 :");
		Customer findCustomer = service.findById(4L);
		display(findCustomer);

		System.out.println("After adding amount in Tanisha's Account");
		Long pranavId = pranav.getId();
		Customer pranavAmount = service.addAmount(pranavId, 2000.0);
		display(pranavAmount);

	}

	void display(Customer customer) {
		Account account = customer.getAccount();
		System.out.println("Customer " + customer.getId() + " " + customer.getName() + " " + account.getAccountId()
				+ " " + account.getBalance() + " " + account.getCreated());
	}
}