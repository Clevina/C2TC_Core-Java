package com.abstractExample;
abstract class Animal2{
	public abstract void sound();
}
 class Lion1 extends Animal2
{

	public void sound() {
		
		System.out.println("Roar");
		
	}
}

public class Main2 {

	public static void main(String[] args) {
		Animal2 a=new Lion1();
		a.sound();

	}

}
