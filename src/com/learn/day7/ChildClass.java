package com.learn.day7;

// extends - Child extends Parent <-- inheritance

public class ChildClass extends ParentClass{
	// Compiler will only add no-arg constructor if there is NO constructor defined
	
	public ChildClass() {
		// Compiler is adding Parent no-arg constructor
		super("ParentParm");
		System.out.println("Child CLass Constructor");
	}
	
	public ChildClass(String childParm){
		super(childParm);
		System.out.println("Child CLass Constructor :: " + childParm);
	}
	
	public ChildClass(String childParm, int abc){
		this(childParm);
		System.out.println("Child CLass Constructor :: " + abc);
	} 
}
