package com.simplilearn.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> map=new Hashtable<Integer, String>();
		
		map.put(1, "Tanmay");
		map.put(2, "Rahul");
		map.put(5, "test");
		map.put(8, "user");
		
		
		System.out.println(map);
		System.out.println("get element "+map.get(5));
		map.remove(8);
		System.out.println(map);
		
		//iterate using for loop
		for(Map.Entry m :map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}
