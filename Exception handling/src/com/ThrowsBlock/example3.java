package com.ThrowsBlock;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		System.out.println(s);
	}
}
public class example3 {
	static void validate(int age)throws InvalidAgeException
	{
		if(age<18 )
		{
			throw new InvalidAgeException("invalid input");
		}
		else
		{
			System.out.println("Right to vote");
		}
	}

	public static void main(String[] args) {
		try
		{
			validate(14);
		}
		catch(Exception m)
		{
			System.out.println("Exception occurred:"+m);
		}
		System.out.println("Rest of the code..");
		
	}

}
