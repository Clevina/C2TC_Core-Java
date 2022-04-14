package com.abstractExample;
abstract class Animal
{
	abstract void eat();
}
class Herbivorous extends Animal{
	void eat()
	{
		System.out.println("Im a vegetarian");
	}
	
}
class Carnivorous extends Animal{
	void eat()
	{
		System.out.println("Im a  non vegetarian");
	}
}
public class Main {

	public static void main(String[] args) {
		//Animal goat1=new Animal();
		Animal goat=new Herbivorous();
		goat.eat();
		Animal Lion= new Carnivorous();
		Lion.eat();

	}

}
