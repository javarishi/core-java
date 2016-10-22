package com.learn.day5;

public class TestModifiers {

	public static void main(String[] args) {
		//ClassName instanaceName = new ClassName(); // Using ‘new’ keyword
		
		MyClass myClass = new MyClass();
		myClass.publicModifer();
		myClass.defaultModifer();
		myClass.protectedModifer();
		// The method privateModifer() from the type MyClass is not visible
		//myClass.privateModifer();

	}

}
