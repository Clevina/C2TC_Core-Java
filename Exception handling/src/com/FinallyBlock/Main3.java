package com.FinallyBlock;
class Bike
{
	public void petrol()
	{
		
	}
}
public class Main3 {

	public static void main(String[] args) {
		Bike fz= null;
		try
		{
			fz.petrol();
		}
		catch(NullPointerException e)
		{
			System.out.println("There is a NullPointerException");
		}
		catch(Exception e)
		{
			System.out.println("There is an Exception:");
		}
		System.out.println("Everything went fine");
	
		
	}

}
