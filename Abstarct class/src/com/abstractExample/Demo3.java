package com.abstractExample;
abstract class Bike1
{
	Bike1()//abstract constructor
	{
		System.out.println("Bike is created");
	}
	abstract void run();
	void gearchange()
	{
		System.out.println("Gear changed");
	}
	
}
class Honda1 extends Bike1
{

	@Override
	void run() {
		System.out.println("Running safely");
		
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		Honda1 h=new Honda1();
		h.run();
		h.gearchange();

	}

}

