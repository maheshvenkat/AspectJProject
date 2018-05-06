package com.aspectj.test.core;

import com.aspectj.test.customer.bo.CustomerBo;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

public class App {
	public static void main(String[] args) throws Exception {

		org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(App.class);
		PropertyConfigurator.configure("log4j.properties");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

		log.debug("Testing AspectJ");
		CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");


		customer.addCustomerAround("mike");

	}
}