package com.aspectj.test.customer.bo.impl;

import com.aspectj.test.customer.bo.CustomerBo;
import org.apache.log4j.Logger;

public class CustomerBoImpl implements CustomerBo {
	Logger logger = Logger.getLogger(CustomerBoImpl.class);

	public void addCustomer(){
		System.out.println("addCustomer() is running ");
	}
	
	public String addCustomerReturnValue(){
		System.out.println("addCustomerReturnValue() is running ");
		return "abc";
	}
	
	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}
	
	public void addCustomerAround(String name){
		logger.debug("Value String "+name);
		System.out.println("addCustomerAround() is running, args : " + name);
	}
}