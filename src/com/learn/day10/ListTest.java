package com.learn.day10;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// ArrayList - random access, order is not maintained
		
		List<String> testArrayList = new ArrayList<>();
		testArrayList.add("A");
		testArrayList.add(1, "B");
		testArrayList.add(2, "C");
		
		System.out.println("Before " + testArrayList);
		testArrayList.add(2, "D");
		
		System.out.println("After  " +  testArrayList);
		
		System.out.println(testArrayList.size());
		
		System.out.println(testArrayList.get(2));
		
		// fromIndex - inclusive toIndex - exclusive
		System.out.println(testArrayList.subList(1, 3));
		
	}

}
