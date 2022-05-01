package com.ThrowBlock;

public class Example1 {
public static void validate(int age)
{
	if(age<21||age>27)
	{
	throw new ArithmeticException("not eligible");	
	}
	else
	{
		System.out.println("Eligible to attend Military selection");	
		}

}
	public static void main(String[] args) {
		validate(30);
		System.out.println("Rest of the code");
		
	}

}
