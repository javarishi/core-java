package com.learn.day9;

public class Implementor implements TestInterface {

	public static void main(String[] args) {
		System.out.println(TestInterface.testVar);
		//TestInterface.testVar = "New Value";
		TestInterface test =  new Implementor();
		test.testInterfaceMethod();
		// test.normalMethod();
		
		Implementor impl = new Implementor();
		impl.testInterfaceMethod();
		impl.normalMethod();
	}

	@Override
	public void testInterfaceMethod() {
		System.out.println("From Interface");
		
	}
	
	public void normalMethod(){
		System.out.println("Normal Method");
	}

}
