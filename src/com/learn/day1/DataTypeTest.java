package com.learn.day1;

public class DataTypeTest {
	
	/*
	 Output:
		Hello I am getting introduced to Java
		Integer is this :: 45
		Float is :: 10.45
		Boolean is false
		My Email Address is :: rishi.h2kinfosys@gmail.com
		and Object is with new keyword
	 */
	
	// Instance Variables - as value is copied / different in each instance 
	// DataType varaibleName = value; 
	byte byteVar = 127;
	short shortVar = 32767;
	int integerVar = 2147483647; 
	long longVar = 214748364800l;
	
	// Decimals / floats
	float floatVar = 10.45f;
	double doubleVar = 324.234324;
	
	// Character
	char charVar = '$';
	// String is not a primitive type
	String stringVar = "rishi.h2kinfosys@gmail.com";
	
	// Boolean variables
	boolean boolVar = false;
	
	// Define a Method
	void testVariables(){
		System.out.println(" Byte Variable :: " + byteVar);
		System.out.println(" Short Variable :: " + shortVar);
		System.out.println(" Integer Variable :: " + integerVar);
		System.out.println(" Long Variable :: " + longVar);
		System.out.println(" Float Variable :: " + floatVar);
		System.out.println(" Double Variable :: " + doubleVar);
		System.out.println(" Character Variable :: " + charVar);
		System.out.println(" String Variable :: " + stringVar);
		System.out.println(" Boolean Variable :: " + boolVar);
	}
	
	
	public static void main(String args[]){
		// Java Object Creation with new keyword
		DataTypeTest test = new DataTypeTest(); 
		test.testVariables(); // Calling methods on Object
		
	}

}
