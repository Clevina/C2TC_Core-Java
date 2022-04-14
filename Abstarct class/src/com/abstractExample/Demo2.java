package com.abstractExample;
abstract class Bank{
	abstract int rateOfInterest();
}
class SBI extends Bank{
	int rateOfInterest()
	{
		
		return 7;
	}
}
class HDFC extends Bank
{
	int rateOfInterest()
	{
	
		return 8;
	}
}
public class Demo2 {

	public static void main(String[] args) {
	Bank s= new SBI();
	s.rateOfInterest();
	Bank h= new HDFC();
	System.out.println("the rate of interest in SBI IS:" +s.rateOfInterest());
	System.out.println("the rate of interest in HDFC IS:" +h.rateOfInterest());
	

	}

}
