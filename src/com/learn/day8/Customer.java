package com.learn.day8;

/*
 *  Transfer Object
 *  Data TO
 *  POJO
 *  Bean
 *  Entity
 *  Persistent Class
 *  Model CLasses
 */

public class Customer {
	
	public Customer() {
		System.out.println("This is Customer Constructor");
	}

	private String firstName;
	private String lastName;
	private String address;
	
	
	protected Customer validateAddress(String city, String zipCode) {
		System.out.println("Simple Validation Logic " + city + " and ZipCode  " +  zipCode);
		return null;
	}
	
	
	public final void searsLogic(){
		System.out.println("I dont want anyone to override this Logic");
	}
	
	
	// Getter Method
	public String getFirstName(){
		return firstName;
	}
	// setter
	public void setFirstName(String fName){
		firstName = fName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
}
