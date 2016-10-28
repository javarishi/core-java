package com.learn.day9;

public class ChildofAbstract extends TestAbstract{
	/* 3. The type ChildofAbstract must implement the inherited 
	 * abstract method TestAbstract.testAbstractMethod()
	 */
	
	
	
	@Override
	public void testAbstractMethod() {
		System.out.println("Implementation of abstract method from TestAbstract Class");
	}

	@Override
	public void anotherAbstract() {
		// TODO Auto-generated method stub
	}
	
	
	
	public static void main(String[] args) {
		
		// 6. Abstract class cannot be instantiated
		TestAbstract test = new ChildofAbstract();
		test.testAbstractMethod();
		test.normalMethod("TestString");
		System.out.println(test.standardVariable);
	//	test.standardVariable = " CHanged Value";
		// Child class can override normal methods as normal overring rules
		ChildofAbstract child = new ChildofAbstract();
		child.testAbstractMethod();
		child.normalMethod("TestString 2");
	}

}
