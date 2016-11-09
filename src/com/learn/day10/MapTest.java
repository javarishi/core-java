package com.learn.day10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> mapTest = new HashMap<>();
		mapTest.put(1, "A");
		mapTest.put(2, "B");
		mapTest.put(3, "C");
		mapTest.put(4, "D");
		mapTest.put(5, "E");
		
		mapTest.remove(2);
		
		System.out.println(mapTest);
		System.out.println(mapTest.size());
		
		Set<Integer> keySet = mapTest.keySet();
		for(int key : keySet){
			System.out.println("Key :: " + key + " Value :: " + mapTest.get(key)) ;
		}
		
		
		LinkedHashMap<Integer, String> linkedMapTest = new LinkedHashMap<>();
		linkedMapTest.put(1, "A");
		linkedMapTest.put(2, "B");
		linkedMapTest.put(3, "C");
		linkedMapTest.put(4, "D");
		linkedMapTest.put(5, "E");

		System.out.println(linkedMapTest);
	}

}
