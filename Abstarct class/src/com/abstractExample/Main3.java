package com.abstractExample;
abstract class Base
{
	void fun()
	{
		System.out.println("Abstract class method");
	}
}
class Derived extends Base{//public error
	
}
public class Main3 {

	public static void main(String[] args) {
	Derived d=new Derived();
	d.fun();

	}

}
