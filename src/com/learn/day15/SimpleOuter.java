package com.learn.day15;

public class SimpleOuter {

	private String outerString = "Outer";
	private static String staticOuterString = "OuterStatic";
	
	public static void main(String[] args) {
		StaticInnerClass staticInner = new StaticInnerClass();

	}
	
	public void normalMethod(){
		System.out.println("Can I access it without instance");
	}
	// Not possible
	/*
	void printInner(){
		System.out.println("Inner Class Variable :: " + testInnerVariable);
	}*/
	
	// This is Inner Class / instance class
	class SimpleInnerClass {
		
		public String testInnerVariable = "Test";
		// Not possible
		//private static String variable = "StaticVar";
		
		void printOuter(){
			System.out.println("Printing Outer Variable " + outerString);
		}
		
		void printInner(){
			System.out.println("Inner Class Variable :: " + testInnerVariable);
		}
	}
	// Static Inner Class
	static class StaticInnerClass {
		
		void printOuter(){
			System.out.println("Printing Outer Variable " + staticOuterString);
		}
		
	}

}
