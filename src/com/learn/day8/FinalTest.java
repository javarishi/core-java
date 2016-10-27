package com.learn.day8;

// You cannot create a child class out of final Class
public final class FinalTest {

	// Variable Final - you cannot change the value
	final String test = "Rishi";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void tryChanging(){
	//	this.test = "Somethnig Else";
	}

	
	public final void testFinalMethod(){
		System.out.println("You cannot override this method");
	}
}
