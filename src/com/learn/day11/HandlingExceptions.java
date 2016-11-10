package com.learn.day11;

public class HandlingExceptions {

	public static void main(String[] args) {
		int valA =100;
		int valB = 0;
		try{
			double result = valA / valB;
			System.out.println("Good Result no exception :: " +result);
		}catch(ArithmeticException ae){
			System.out.println("Input may be wrong. Received ArithmeticException");
			System.out.println("ae.getMessage() :: " + ae.getMessage());
			System.out.println("ae.getCause() :: " + ae.getCause());
			ae.printStackTrace();
			StackTraceElement[] traceElement = ae.getStackTrace();
		}catch(Exception e){
			System.out.println("Input may be wrong. Received Exception");
		}finally{
			System.out.println("Finally Block :: Arithmatic Calculation are most important");
		}
		System.out.println("Thank You");
		// try can exists without catch but finally 
		try{
			String str = "test";
			int testConversion = Integer.parseInt(str);
			System.out.println(testConversion);
		}finally{
			System.out.println("I am done without catching");
		}
		
		ThrowTest test = new ThrowTest();
		
		try {
			test.doBusiness();
			//test.anotherBusinessLogic(null);
			test.testAge();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (AgeRangeNotMatchingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.sendEmailToDoctor("Message Here");
		} 
		
		
	}

}
