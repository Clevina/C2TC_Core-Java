package com.dowhile;

public class BreakForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			System.out.println("Before breaking =" +i);
			if(i==6)
			{
				break;
			}
			System.out.println("After breaking="+i);
		}
		System.out.println("forloop terminated.");

	}

}
