package com.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.model.CustomerBean;
import com.loan.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerBean saveCustomer (CustomerBean customerbean) {
		
		CustomerBean customer = customerRepository.save(customerbean);
		return customer;
		
	}

	public List<CustomerBean> getCustomers() {
		List<CustomerBean> custList = customerRepository.findAll();
		return custList;
		
		
	}

	public CustomerBean getCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerRepository.findOne(id);
	}

	public void deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		 customerRepository.delete(id);
	}


}
