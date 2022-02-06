package com.simplilearn.collectionFrame;

import java.util.*;
public class MyList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList= new ArrayList<>();
		System.out.println("Arraylist before inserting value"+arrayList.size());
		arrayList.add(9);
		arrayList.add(45);
		arrayList.add(3);
		arrayList.add(23);
		arrayList.add(100);
		System.out.println("Arraylist after inserting value"+arrayList.size());
	}

}
