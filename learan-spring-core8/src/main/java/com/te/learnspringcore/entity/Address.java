package com.te.learnspringcore.entity;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String employeeAddressType;
	private String employeeContry;
	private String employeeCity;
	public Address() {
		super();
	}
	public Address(String employeeAddressType, String employeeContry, String employeeCity) {
		super();
		this.employeeAddressType = employeeAddressType;
		this.employeeContry = employeeContry;
		this.employeeCity = employeeCity;
	}
	public String getEmployeeAddressType() {
		return employeeAddressType;
	}
	public void setEmployeeAddressType(String employeeAddressType) {
		this.employeeAddressType = employeeAddressType;
	}
	public String getEmployeeContry() {
		return employeeContry;
	}
	public void setEmployeeContry(String employeeContry) {
		this.employeeContry = employeeContry;
	}
	public String getEmployeeCity() {
		return employeeCity;
	}
	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeAddressType == null) ? 0 : employeeAddressType.hashCode());
		result = prime * result + ((employeeCity == null) ? 0 : employeeCity.hashCode());
		result = prime * result + ((employeeContry == null) ? 0 : employeeContry.hashCode());
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
		Address other = (Address) obj;
		if (employeeAddressType == null) {
			if (other.employeeAddressType != null)
				return false;
		} else if (!employeeAddressType.equals(other.employeeAddressType))
			return false;
		if (employeeCity == null) {
			if (other.employeeCity != null)
				return false;
		} else if (!employeeCity.equals(other.employeeCity))
			return false;
		if (employeeContry == null) {
			if (other.employeeContry != null)
				return false;
		} else if (!employeeContry.equals(other.employeeContry))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Address [employeeAddressType=" + employeeAddressType + ", employeeContry=" + employeeContry
				+ ", employeeCity=" + employeeCity + "]";
	}
	
}
