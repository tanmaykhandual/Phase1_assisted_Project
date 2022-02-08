package com.simplilearn.OOPs;

public class callByValue {
	
	int num=150;
	
	void operation(int num)
	{
		this.num=num*100/10;
	}

	public static void main(String[] args) {
		callByValue c= new callByValue();
		System.out.println("Value of num before"+c.num);
		
		c.operation(100);
		System.out.println("Value of num after"+c.num);

	}

}
