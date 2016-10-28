package com.learn.day9;

public abstract class TestAbstract {
	
	protected String standardVariable = "Value";

	// 1. Abstract methods do not specify a body. Directly ends with semicolon
	// 2. The abstract method testAbstractMethod in type TestAbstract can 
	// only be defined by an abstract class
	public abstract void testAbstractMethod();
	/*{
		System.out.println("This is abstract method");
	}*/
	
	// 4. You should not combine abstract and final 
	public abstract void anotherAbstract();
	
	// 5. You can have normal methods in abstract Class
	public void normalMethod(String strVal){
		System.out.println("This is normal method from Abstract Class :: " + strVal);
	}
	
	
}
