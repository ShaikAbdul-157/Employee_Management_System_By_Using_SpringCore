package com.te.learnspringcore01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.learnspringcore.entity.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-config.xml");
		//Employee employee = applicationContext.getBean(Employee.class);
		Employee employee1 = (Employee) applicationContext.getBean("employee");
		// System.out.println(employee == employee1);
		Employee employee_ = (Employee) applicationContext.getBean("employee1");
		Employee employee_1 = (Employee) applicationContext.getBean("employee1");
		System.out.println(employee_ == employee_1);
	}
}
