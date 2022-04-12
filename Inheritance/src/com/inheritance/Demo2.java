package com.inheritance; //multilevel inheritance



class Animal2
{
	void eat()
	{
		System.out.println("Eating...!");
	}
}
class dog2 extends Animal2
{
	void bark()
	{
		System.out.println("Barking...!");
	}
}
class puppy1 extends dog2
{
	void weep()
	{
		System.out.println("Weeping..!");
	}
}
public class Demo2 {

	public static void main(String[] args) {
	puppy1 a=new puppy1();
	a.weep();
	a.bark();
	a.eat();

	}

}
