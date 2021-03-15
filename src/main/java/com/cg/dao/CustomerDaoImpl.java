package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entites.Customer;

@Repository
public class CustomerDaoImpl implements ICustomerDao {

	@PersistenceContext 
	private EntityManager entitymanager;
	
	@Transactional
	@Override
	public Customer add(Customer customer) {
		entitymanager.persist(customer);
		return customer;
	}

	@Override
	public Customer findById(Long customerId) {
		Customer customer = entitymanager.find(Customer.class, customerId);
		return customer;
	}

	@Transactional
	@Override
	public Customer update(Customer customer) {
		entitymanager.merge(customer);
		return customer;
	}
	
}
