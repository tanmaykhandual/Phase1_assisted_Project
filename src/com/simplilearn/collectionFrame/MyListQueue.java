package com.simplilearn.collectionFrame;
import java.util.*;

public class MyListQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		
		for(int i = 0;i<5;i++)
			q.add(i);
		System.out.println("Element of Queue"+q);
		
		int removed= q.remove();
		System.out.println("Removed from "+removed);
		
		System.out.println(q);
		
		int head= q.peek();
		System.out.println("Head of Queue="+head);
		

	}

}
