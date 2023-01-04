package com.te.learnspringcoreproject.service;

public class MyServiceImp01 implements MYService {
	
	private String myServiceName;
	private Integer myServiceNumber;
	
	public MyServiceImp01() {
		super();
	}

	@Override
	public String swiggyService() {
		
		return "swiggyService()OfMyServiceImp01";
	}

	@Override
	public String toString() {
		return "MyServiceImp01 [myServiceName=" + myServiceName + ", myServiceNumber=" + myServiceNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((myServiceName == null) ? 0 : myServiceName.hashCode());
		result = prime * result + ((myServiceNumber == null) ? 0 : myServiceNumber.hashCode());
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
		MyServiceImp01 other = (MyServiceImp01) obj;
		if (myServiceName == null) {
			if (other.myServiceName != null)
				return false;
		} else if (!myServiceName.equals(other.myServiceName))
			return false;
		if (myServiceNumber == null) {
			if (other.myServiceNumber != null)
				return false;
		} else if (!myServiceNumber.equals(other.myServiceNumber))
			return false;
		return true;
	}

	public String getMyServiceName() {
		return myServiceName;
	}

	public void setMyServiceName(String myServiceName) {
		this.myServiceName = myServiceName;
	}

	public Integer getMyServiceNumber() {
		return myServiceNumber;
	}

	public void setMyServiceNumber(Integer myServiceNumber) {
		this.myServiceNumber = myServiceNumber;
	}

	public MyServiceImp01(String myServiceName, Integer myServiceNumber) {
		super();
		this.myServiceName = myServiceName;
		this.myServiceNumber = myServiceNumber;
	}

	@Override
	public String zomatoService() {
		
		return "zomatoService()Of MyServiceImp01";
	}

}
