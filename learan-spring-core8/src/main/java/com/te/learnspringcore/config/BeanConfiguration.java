package com.te.learnspringcore.config;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.te.learnspringcore.entity.Address;
import com.te.learnspringcore.entity.Employee;

@Configuration // component+configuration metadata
@ComponentScan(basePackages = "com.te.learnspringcore")
public class BeanConfiguration {
	
	@Primary
	@Bean(name = "address")
	public Address getAddrBean() {
		Address address = new Address();
		address.setEmployeeCity("Hyd");
		address.setEmployeeAddressType("Per");
		address.setEmployeeContry("INDIA");
		return address;

	}
	
	@Bean(name = "address1")
	public Address getAddrBean1() {
		Address address = new Address();
		address.setEmployeeCity("Pune");
		address.setEmployeeAddressType("Temp");
		address.setEmployeeContry("INDIA");
		return address;

	}

	@Scope(value = "prototype")
	@Bean(name = "employee")
	public Employee getEmpBean() {
		Employee employee = new Employee();
		employee.setEmpName("Abdul");
		employee.setEmpAge(22);
		employee.setEmpId(111);
		ArrayList<String> list = new ArrayList();
		list.add("mass");
		list.add("raj");
		list.add("dass");
		list.add("hass");
		employee.setEmpFrinds(list);
		return employee;
	}

	@Bean(name = "employee01")
	public Employee getEmpBean01() {
		Employee employee = new Employee();
		employee.setEmpName("Abdul");
		employee.setEmpAge(22);
		employee.setEmpId(111);
		ArrayList<String> list = new ArrayList();
		list.add("mass");
		list.add("raj");
		list.add("dass");
		list.add("hass");
		employee.setEmpFrinds(list);
		return employee;

	}
}
