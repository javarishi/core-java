package com.learn.day4;

import com.learn.day5.MyClass;

public class TestModifersOutofPackage {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.publicModifer();
		// all below access modifers are not visible
		//myClass.defaultModifer();
		//myClass.protectedModifer();
		// The method privateModifer() from the type MyClass is not visible
		//myClass.privateModifer();

	}

}
