package com.MethodOverloading;
class Adder1
{
	
	static int add(int a, int b)
	{
		return a+b;
	}
	static double add(double a, double b)
	{
		return a+b;
	}
}
public class TestOverloading2 {

	public static void main(String[] args) {
		Adder1 add1= new Adder1();
		System.out.println(Adder1.add(12, 12));
		System.out.println(Adder1.add(14.0, 34.0));
	}

}
