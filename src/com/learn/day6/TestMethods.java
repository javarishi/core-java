package com.learn.day6;

public class TestMethods {

	public static void main(String[] args) {
		// You call a method on Object / instance 
		TestMethods test = new TestMethods();
		String message = test.addressValidation("Smyrna");
		System.out.println(message);

	}
	
	/* 6 components
	 *  1. Access Modifier
	 *  2. return type - object / void (output of method)
	 *  3. name of the method
	 *  4. Parameter List in () - input to the method - primitives and objects
	 *  5. method body - written in {}
	 *  6. Exception List - We will learn this in Exception Handling
	 */

	public String addressValidation(int zipCode, String city) {
		String message;
		// If zip code is 5 digit then address is valid
		if(String.valueOf(zipCode).length() <= 5){
			message = "Address is Valid";
		}else{
			message = "Address is not Valid";
		}
		System.out.println("Complex Logic to Handle Address Validation");
		return message;
	}
	
	public String addressValidation(int zipCode) {
		String message;
		// If zip code is 5 digit then address is valid
		if(String.valueOf(zipCode).length() <= 5){
			message = "Address is Valid";
		}else{
			message = "Address is not Valid";
		}
		System.out.println("Complex Logic to Handle Address Validation");
		return message;
	}
	
	
	public String addressValidation(String city) {
		String message = "Address is valid";
		System.out.println("Complex Logic to Handle Address Validation");
		return message;
	}
	
	
}
