package com.ThrowsBlock;

import java.io.IOException;

public class Example7 {
	void m() throws Exception
	{
		throw new java.io.IOException("Error");
	}
	void n() throws Exception
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

	public static void main(String[] args) {
		Example7 obj= new Example7();
		obj.p();
		System.out.println("Normal flow");

	}

}
