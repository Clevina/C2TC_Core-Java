package com.ThrowBlock;

public class Example3 {

	public static void validate(int age)
	{
		if(age<21 || age>27)
		{
			throw new ArithmeticException("not eligible");
		}
		else
		{
			System.out.println("eligible to attend military selection");
		}
	}
		public static void main(String[] args) {
			try
			{
			validate(21);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			System.out.println("Rest of the code");

		}
		

	}


