package com.abstractExample;
abstract class A
{
	abstract void abstract_method();
	public void normal()
	{
		System.out.println("I am Inevitable");
	}
}
 class B extends A{//public error
	 public void abstract_method()
	 {
		 System.out.println("I am ironman");
	 }
	
}
public class Main4 {

	public static void main(String[] args) {
		B b= new B();
		b.abstract_method();
		b.normal();
	}

}
