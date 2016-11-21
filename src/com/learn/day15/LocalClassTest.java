package com.learn.day15;

public class LocalClassTest {
	
	String outerClassInstanceVar = " outerClassInstanceVar ";
	String outerClassFinalVar = " outerClassFinalVar ";

	public static void main(String[] args) {
		LocalClassTest test = new LocalClassTest();
		test.someMethod();

	}
	
	void someMethod(){
		String methodVariable = " methodVariable ";
		// This is Local CLass
		class MyLocalClass{
			String localClassInstanceVar = " localClassInstanceVar ";
			
			void localMethod(){
				System.out.println(" Outer :: " + outerClassInstanceVar);
				System.out.println(" OuterFinal :: " + outerClassFinalVar);
				System.out.println(" methodVariable :: " + methodVariable);
				System.out.println(" localClassInstanceVar :: " + localClassInstanceVar);
			}
		}
		MyLocalClass localClas = new MyLocalClass();
		localClas.localMethod();
		
	}

}
