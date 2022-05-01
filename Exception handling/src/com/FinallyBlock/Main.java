package com.FinallyBlock;

public class Main {

	public static void main(String[] args) {
		try
		{
			int data=30/3;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block is alwayts executed");
		}

	}

}
