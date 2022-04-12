package com.inheritance;   //hierarchical
class Animal3
{
	void eat()
	{
		System.out.println("Eating....!");
	}
}
class Dog3 extends Animal3
{
	void bark()
	{
		System.out.println("Barking...!");
	}
}
class cat extends Animal3
{
	void meow() 
	{
		System.out.println("Meowing..!");
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		cat c =new cat();
		c.meow();
		c.eat();
	
		Dog3 d=new Dog3();
		d.bark();
		d.eat();
		

	}

}

