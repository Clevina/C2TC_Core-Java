package com.ThrowsBlock;

import java.util.Scanner;

class InvalidbloodDonateException extends Exception
{
	InvalidbloodDonateException(String s)
	{
		super(s);
	}
}
public class Example2 {
	static void validate(int age,int weight)throws InvalidbloodDonateException
	{
		if(age<18 && weight<55)
		{
			throw new InvalidbloodDonateException("not eligible");
		}
		else
		{
			System.out.println("can donate blood");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		int weight= sc.nextInt();
		try
		{
			validate(age,weight);
		}
		catch(Exception m)
		{
			System.out.println("Exception occurred:"+m);
		}
		System.out.println("Rest of the code..");

	}

}
