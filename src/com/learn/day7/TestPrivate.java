package com.learn.day7;

import com.learn.day9.TestInterface;

public class TestPrivate implements TestInterface{

	public static void main(String[] args) {
		// If constructor is not visible, instance cannot be created
		//TestClass testNow = new TestClass();
		

	}

	@Override
	public void testInterfaceMethod() {
		System.out.println(testVar);
		
	}

}
