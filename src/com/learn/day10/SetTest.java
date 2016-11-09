package com.learn.day10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// random but fastest 
		Set<String> hashSet = new HashSet<>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		
		System.out.println(hashSet.add("A"));
		System.out.println("hashSet " + hashSet);
		// ascending order
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(1);
		treeSet.add(4);
		treeSet.add(6);
		treeSet.add(2);
		treeSet.add(9);
		
		System.out.println("treeSet " + treeSet);
		// Order of insertion
		LinkedHashSet<Integer> linkedHSet = new LinkedHashSet<>();
		
		linkedHSet.add(1);
		linkedHSet.add(4);
		linkedHSet.add(6);
		linkedHSet.add(2);
		linkedHSet.add(9);
		System.out.println("linkedHSet " + linkedHSet);
	}

}
