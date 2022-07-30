package com.samplejavaproject;

public class School {

	private String name;
	private String address;
	
	
	
	
	
	public School(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		//this.isSeniorSecondary = isSeniorSecondary;
	}
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	public boolean isSeniorSecondary() {
//		return isSeniorSecondary;
//	}
//	public void setSeniorSecondary(boolean isSeniorSecondary) {
//		this.isSeniorSecondary = isSeniorSecondary;
//	}
	@Override
	public String toString() {
		return "School [name=" + name + ", address=" + address + "]";
	}
	
	
	
}
