package com.ThrowsBlock;

import java.util.Scanner;

class NamenotFoundException extends Exception
{
	NamenotFoundException(String message)
	{
		System.out.println(message);
	}
}
public class Example4 {
	

	public static void main(String[] args) {
		
		  Scanner sc= new Scanner(System.in); 
		  String name= sc.nextLine();;
		 
		try
		{
			customername(name);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	static void customername(String name) throws NamenotFoundException
	{
		if(name.isEmpty())
		{
			throw new NamenotFoundException("Name id Empty");
		}
		else
		{
			System.out.println("Hi"+name+",welcome to our store");
		}
	}

}
