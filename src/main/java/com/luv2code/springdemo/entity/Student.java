package com.luv2code.springdemo.entity;


public class Student {

	private String lastName;
	private String firstName;
	
	private void Studetn() { }
	
	public Student(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	
}
