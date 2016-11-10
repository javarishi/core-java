package com.learn.day11;

public class ThrowTest {
	
	public void doBusiness() throws InterruptedException{
		System.out.println("Some Business");
		Thread.sleep(1000);
	}
	
	public void anotherBusinessLogic(String str) throws Exception{
		if(str == null ){
			throw new Exception("Parameter String is Empty");
		}
	}
	
	public void testAge() throws AgeRangeNotMatchingException{
		int age = 10;
		
		if(age < 18){
			throw new AgeRangeNotMatchingException("Age is below 18");
		}
	}

}
