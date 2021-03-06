package com.ram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ram.model.Address;
import com.ram.model.Employee;

/**
 * Annotate with @Configuration to tell Spring that this is the core
 * Spring configuration file, and define bean via @Bean.
 */
@Configuration
public class ApplicationBeans
{

	@Bean(name = "address")
	public Address getAddress()
	{
		Address address = new Address();
		address.setCity("TamilNadu");
		address.setState("Chennai");
		return address;
	}

	@Bean(name = "employee")
	public Employee getEmployee()
	{
		Employee employee = new Employee();
		employee.setId(100);
		employee.setName("Peter");
		return employee;
	}

}