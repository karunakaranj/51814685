package com.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.loan.model.CustomerBean;
import com.loan.service.CustomerService;

@Controller
public class CustomerController {
	 
	@Autowired
    CustomerService service;
 
    @RequestMapping(value= "/customer/all", method= RequestMethod.GET)
    public List<CustomerBean> getEmployees() {
       
        return service.getCustomers();
    }
 
    @RequestMapping(value= "/customer/add", method= RequestMethod.POST)
    public CustomerBean createCustomer(@RequestBody CustomerBean customer) {
    	CustomerBean.setCustomer_id(1);
    	CustomerBean.setCustomer_name("Siva");
    	CustomerBean.setCredit_score(950);
    	CustomerBean.setDob("12-2-90");
    	CustomerBean.setExpense(800);
    	CustomerBean.setGender("male");
    	CustomerBean.setMarital_status("single");
    	CustomerBean.setMobNumber((long) 993213456);
    	CustomerBean.setSalary(555);
        return service.saveCustomer(customer);
    }
    
    @RequestMapping(value= "/customer/delete/{id}", method= RequestMethod.DELETE)
    public void deleteEmployeeById(@PathVariable int id) throws Exception {
 
        CustomerBean emp =  service.getCustomerById(id);
        if(emp==null) {
        	throw new Exception("Employee not found");
        }
        service.deleteCustomerById(id);
    }
 
}
