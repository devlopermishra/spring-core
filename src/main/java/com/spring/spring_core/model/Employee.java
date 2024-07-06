package com.spring.spring_core.model;

public class Employee {
	private String name;
	private String gender;
	private Address address;
	 
	
	public Employee() {
		System.out.println("Employee.Employee()");
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String gender, Address address) {
		System.out.println("Employee.Employee(3)");
		this.name = name;
		this.gender = gender;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Employee.setname()");
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", address=" + address + "]";
	} 
	
}
