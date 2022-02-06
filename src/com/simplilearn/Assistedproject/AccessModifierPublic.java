package com.simplilearn.Assistedproject;

//public access modifier
public class AccessModifierPublic
{
public void display()
{
System.out.println("Hello world 2");
}
}
      class Test2 {
	  public static void main(String[] args) {
		AccessModifierPublic d= new AccessModifierPublic();
		d.display();
		
	}

}