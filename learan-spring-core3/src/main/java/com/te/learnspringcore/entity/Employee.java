package com.te.learnspringcore.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements Serializable ,DisposableBean,InitializingBean {
	public Employee(Address address) {
		super();
		this.address = address;
	}
	Address address2=new Address("present","Ind","Lacno");
	private Integer empId;
	private String empName;
	private Integer empAge;
	private Double empsal;
	private List<String> empFrinds;
	private Set<String> empProjects;
	private Map<String, Integer> empContribution;
	private Address address;

	public Employee() {
		System.out.println("Employee()");

	}

	public Employee(Integer empId, String empName, Integer empAge, Double empsal, List<String> empFrinds,
			Set<String> empProjects, Map<String, Integer> empContribution, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empsal = empsal;
		this.empFrinds = empFrinds;
		this.empProjects = empProjects;
		this.empContribution = empContribution;
		this.address = address;
	}

	public Integer getEmpId() {
		System.out.println("getEmpId()");
		return empId;
	}

	public void setEmpId(Integer empId) {
		System.out.println("setEmpId(Integer empId)!");
		this.empId = empId;
	}

	public String getEmpName() {
		System.out.println("getEmpName()!");
		return empName;
	}

	public void setEmpName(String empName) {
		System.out.println("setEmpName(String empName)!");
		this.empName = empName;
	}

	public Integer getEmpAge() {
		System.out.println("getEmpAge() !");
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		System.out.println("setEmpAge(Integer empAge)!");
		this.empAge = empAge;
	}

	public Double getEmpsal() {
		System.out.println(" getEmpsal() !");
		return empsal;
	}

	public void setEmpsal(Double empsal) {
		System.out.println("setEmpsal(Double empsal)!");
		this.empsal = empsal;
	}

	public List<String> getEmpFrinds() {
		System.out.println("getEmpFrinds()!");
		return empFrinds;
	}

	public void setEmpFrinds(List<String> empFrinds) {
		System.out.println("setEmpFrinds(List<String> empFrinds)!");
		this.empFrinds = empFrinds;
	}

	public Set<String> getEmpProjects() {
		System.out.println("getEmpProjects()!");
		return empProjects;
	}

	public void setEmpProjects(Set<String> empProjects) {
		System.out.println("setEmpProjects(Set<String> empProjects)!");
		this.empProjects = empProjects;
	}

	public Map<String, Integer> getEmpContribution() {
		System.out.println("Map<String, Integer> getEmpContribution()!");
		return empContribution;
	}

	public void setEmpContribution(Map<String, Integer> empContribution) {
		System.out.println("setEmpContribution(Map<String, Integer> empContribution)!");
		this.empContribution = empContribution;
	}

	public Address getAddress() {
		System.out.println("getAddress()!");
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setAddress(Address address)!");
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((empAge == null) ? 0 : empAge.hashCode());
		result = prime * result + ((empContribution == null) ? 0 : empContribution.hashCode());
		result = prime * result + ((empFrinds == null) ? 0 : empFrinds.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empProjects == null) ? 0 : empProjects.hashCode());
		result = prime * result + ((empsal == null) ? 0 : empsal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (empAge == null) {
			if (other.empAge != null)
				return false;
		} else if (!empAge.equals(other.empAge))
			return false;
		if (empContribution == null) {
			if (other.empContribution != null)
				return false;
		} else if (!empContribution.equals(other.empContribution))
			return false;
		if (empFrinds == null) {
			if (other.empFrinds != null)
				return false;
		} else if (!empFrinds.equals(other.empFrinds))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empProjects == null) {
			if (other.empProjects != null)
				return false;
		} else if (!empProjects.equals(other.empProjects))
			return false;
		if (empsal == null) {
			if (other.empsal != null)
				return false;
		} else if (!empsal.equals(other.empsal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empsal=" + empsal
				+ ", empFrinds=" + empFrinds + ", empProjects=" + empProjects + ", empContribution=" + empContribution
				+ ", address=" + address + "]";
	}
	public void hi() {
		System.out.println("hi()!");
	}
	public void bye() {
		System.out.println("bye()!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init-method");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy-method");
		
	}
}
