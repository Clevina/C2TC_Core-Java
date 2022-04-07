package com.usecasethis;//invoking current class constructor

public class Demo1 {
	Demo1()
	{
		this(10);
		System.out.println("hello A");
	}
	Demo1(int x)
	{
		System.out.println(x);
	}
	public static void main(String[] args) {
		Demo1 d1= new Demo1();
		
	}

}
