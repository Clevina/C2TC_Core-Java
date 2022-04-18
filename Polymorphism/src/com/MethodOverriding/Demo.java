package com.MethodOverriding;
class vehicle
{
	void run()
	{
		System.out.println("vehicle is running");
	}
}
  class Bike extends vehicle 
  { 
	  void run()
	  { 
	  
  System.out.println("Bike is running safely"); } }
 
public class Demo {

	public static void main(String[] args) {
		
		Bike b= new Bike();
		b.run();
	
	
	}

}
