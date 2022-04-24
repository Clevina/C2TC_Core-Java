package com.Practiceqs;
class A
{
	void methodA()
	{
		System.out.println("method of class A");
	}
}
class B extends A
{
	void methodB()
	{
		System.out.println("method of class B");
	}
}
class C extends A
{
	void methodC()
	{
		System.out.println("method of class C");
	}
}
class D extends A
{
	void methodD()
	{
		System.out.println("method of class D");
	}
}
public class HierarachicalInheritance {

	public static void main(String[] args) {
		B ob1= new B();
		ob1.methodA();
		ob1.methodB();
		C ob2= new C();
		ob2.methodC();
		D ob3= new D();
		ob3.methodD();
		ob3.methodA();
	}

}
