package com.learn.day15;

import com.learn.day15.SimpleOuter.StaticInnerClass;

public class TestStaticInnerClass {

	public static void main(String[] args) {
		// Accessing Static Innter Class from Outside
		StaticInnerClass staticInner = 
					new StaticInnerClass();
		staticInner.printOuter();
		// Accessing Inner Class with instance
		
		SimpleOuter outer = new SimpleOuter();
		
		SimpleOuter.SimpleInnerClass innerClass
			= outer.new SimpleInnerClass();
		innerClass.printOuter();
		

	}

}
