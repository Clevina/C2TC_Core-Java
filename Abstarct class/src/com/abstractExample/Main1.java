package com.abstractExample;


abstract class Animal1
{
	abstract void eat();
}
class Herbivorous1 extends Animal1{
	void eat()
	{
		System.out.println("Im a vegetarian");
	}
	
}
class Carnivorous1 extends Animal1{
	void eat()
	{
		System.out.println("Im a  non vegetarian");
	}
}
class Omnivorous extends Animal1{
	void eat()
	{
		System.out.println("I'll eat both veg and non veg");
	}
}


public class Main1 {

	public static void main(String[] args) {
		//Animal goat1=new Animal();
		Animal1 goat=new Herbivorous1();
		goat.eat();
		Animal1 Lion= new Carnivorous1();
		Lion.eat();
		Animal1 s=new Omnivorous();
		s.eat();
	}

}