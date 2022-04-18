package com.MethodOverloading;
class Adder2
{
	static int add1(int a, int b)
	{
		return a+b;
	}
	static double add1(int a, int b, int c)
	{
		return a+b;
	}
}
public class TestOverloading3 {

	public static void main(String[] args) {
		Adder2 add2= new Adder2();
		System.out.println(Adder1.add(12, 12));
		System.out.println(Adder1.add(14.0, 34.0));

	}

}
