package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;

import com.example.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> list = customerRepository.findAll();
		
		return list;
	}

	@Override
	public Customer getCustomerById(long id) {
		return customerRepository.findOne(id);
	}

	

}
