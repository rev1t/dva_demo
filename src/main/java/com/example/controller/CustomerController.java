package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
	
	@RequestMapping(path="/customers_list", method=RequestMethod.GET)
	public String goCustomers(){
		return "customers";
	}

}
