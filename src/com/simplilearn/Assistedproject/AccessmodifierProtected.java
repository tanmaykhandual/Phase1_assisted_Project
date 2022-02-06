package com.simplilearn.Assistedproject;

//protected access modifier
public class AccessmodifierProtected {
		protected void display()
		{
		System.out.println(" Hello world 4");
		}
		}
class B extends AccessmodifierProtected 
   {
   public static void main(String args[])
   {
   B obj = new B();
   obj.display();
   }
   }
