package com.ThrowsBlock;

import java.io.IOException;

class MyMethod
{
	void myMethod(int num) throws Exception
	{
		if(num==1)
		{
			throw new IOException("IOException Occurred");
		}
		else
		{
			throw new ClassNotFoundException("ClassNotFoundException");
		}
			
	}
}
public class Example1 {

	public static void main(String[] args) {
		try
		{
			MyMethod obj= new MyMethod();
			obj.myMethod(1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
