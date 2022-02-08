package com.simplilearn.innerclass;

public class RegularInner {
	
	public int a=30;
	private String b= "Tanmay";
	
	class Inner
	{
		public void Display()
		{
			System.out.println("Value of a="+a);
			System.out.println("Value of b="+b);
		}
	}
	public static void main(String[]args)
	{
		RegularInner outer= new RegularInner();
		RegularInner.Inner inner= outer.new Inner();
		
		inner.Display();
		
	}

}
