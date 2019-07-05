package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)//("singleton")
public class CustomerServiceImpl implements CustomerService {
	
	//@Autowired
	private CustomerRepository customerRespository;
	
	public CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using contructor injection");
		this.customerRespository = customerRepository;
		
	}
	
	@Autowired
	public void setCustomerRespository(CustomerRepository customerRespository) {
		System.out.println("We are using setter injection");
		this.customerRespository = customerRespository;
	}

	@Override
	public List<Customer> findAll(){
		return customerRespository.findAll();
	}
	
}
