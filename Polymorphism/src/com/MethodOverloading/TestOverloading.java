package com.MethodOverloading;//no.of arguments
class Adder
{
	static int add(int a, int b)// method overloading
	{
		return a+b;
	}
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
}
public class TestOverloading {

	public static void main(String[] args) {
		Adder add= new Adder();
		System.out.println(Adder.add(10, 7));
		System.out.println(Adder.add(10, 7, 12));
	

	}

}
