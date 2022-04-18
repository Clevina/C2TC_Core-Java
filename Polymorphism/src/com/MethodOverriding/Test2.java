package com.MethodOverriding;
class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
}
class icici extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}
class axix extends Bank
{
	int getRateOfInterest()
	{
		return 9;
	}
}
public class Test2 {

	public static void main(String[] args) {
		//Bank b= new Bank();
		//System.out.println(b.getRateOfInterest());
		SBI s= new SBI();
		icici i= new icici();
		axix a= new axix();
		System.out.println("SBI Rate of inteterest is :"+s.getRateOfInterest());
		System.out.println("icici rate of interest is "+i.getRateOfInterest());
		System.out.println("axix rate of interest is:" +a.getRateOfInterest());
		
		
	}

}
