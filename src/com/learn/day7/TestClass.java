package com.learn.day7;

public class TestClass {
	
	// Constructor name exactly matches ClassName
	// Default Constructor - no-argument
	private TestClass(){
		// Do not have return type
		System.out.println("I am getting Called - No Argument");
	}
	// Parameterized / argument constructor / Overloaded
	public TestClass(String testString){
		this();
		System.out.println("I am getting Called :: " + testString);
	}
	// How can  I call above constructor
	public TestClass(String testString, int testInt){
		this(testString); // You can call another constructor with this()
		System.out.println("I am getting Called Integer :: " + testInt);
	}

	public static void main(String[] args) {
		// Constructor - Constructs Object
		TestClass test = new TestClass("Parameter", 100);

	}

}
