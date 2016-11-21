package com.learn.day15;

public class TestAnonymousClass {

	public static void main(String[] args) {
		System.out.println(hello.sayHello("English"));

	}
	
	
	static Hello hello = new Hello() {
		
		void Hello(){
			System.out.println("Constructor of AnonymousClass ");
		}
		
		@Override
		public String sayHello(String lang) {
			if(lang.equalsIgnoreCase("English")){
				return "Hello!!";
			}
			return null;
		}
		
		public void SomethingElse(){
			
		}
	};

}
