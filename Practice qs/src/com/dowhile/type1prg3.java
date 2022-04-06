package com.dowhile;
import java.util.*;
public class type1prg3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of row");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			char ch='A';
			
			for(int j=1;j<=i;j++)
			{
				System.out.println(ch++);
					System.out.println();
			}
		}
				

	}

}
