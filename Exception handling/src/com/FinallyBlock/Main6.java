package com.FinallyBlock;

public class Main6 {

	public static void main(String[] args) {
		try
		{
			args= null;
			args[0]="test";
			System.out.println(args[0]);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		/*
		 * catch(NullPointerException e) { System.out.println("NullPointerException"); }
		 */

	}

}
