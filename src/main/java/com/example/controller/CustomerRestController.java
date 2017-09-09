package com.example.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;

import com.example.service.CustomerService;

@RestController
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	
	
	@RequestMapping(path="/customers", method=RequestMethod.GET)
	public List<Customer> getAllCustomers(){
		
		List<Customer> list = customerService.getAllCustomers();
		return list;
	}
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
	public Customer getCustomerById(@PathVariable("id") long id){
		return customerService.getCustomerById(id);
	}

}
