package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	//@Autowired
	private CustomerRepository customerRespository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constructor injection");
		this.customerRespository = customerRepository;
		
	}
	
	//@Autowired
	public void setCustomerRespository(CustomerRepository customerRespository) {
		System.out.println("We are using setter injection");
		this.customerRespository = customerRespository;
	}

	@Override
	public List<Customer> findAll(){
		return customerRespository.findAll();
	}
	
}
