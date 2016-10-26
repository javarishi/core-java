package com.learn.day7;

public class ParentClass {
	
	public ParentClass(String parentParm) {
		System.out.println("Parent CLass Constructor :: " + parentParm);
	}

	private void testPrivate(){
		System.out.println("Check if Private Method is accessible");
	}
	
	protected void testProtected(){
		System.out.println("Check if protected Method is accessible");
	}
	
	public void testPublic(){
		System.out.println("Check if public Method is accessible");
	}
	
}
