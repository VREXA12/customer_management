package com.cg.services;

import java.time.LocalDateTime;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ICustomerDao;
import com.cg.entites.Account;
import com.cg.entites.Customer;

@Service
public class CustomerServiceImp implements ICustomerService {

	@Autowired
	private ICustomerDao dao;

	@Autowired
	public EntityManager entityManager;

	@Transactional
	@Override
	public Customer createCustomer(String name) {
		LocalDateTime now = LocalDateTime.now();
		Account account = new Account(0.0,now);
		entityManager.persist(account);
		Customer customer = new Customer(name, account);
		dao.add(customer);
		return customer;

	}

	@Override
	public Customer findById(long customerId) {
		Customer customer = dao.findById(customerId);
		return customer;
	}

	@Transactional
	@Override
	public Customer addAmount(Long customerId, double amount) {
		Customer customer = dao.findById(customerId);
		customer.getAccount().setBalance(amount);
		customer = dao.update(customer);
		return customer;
	}

}
