package com.abstractExample;

import java.util.Scanner;

abstract class Movie1
{
	 String title;
	abstract void setTitle(String s);
}
class Mymovie1 extends Movie1
{
	 void setTitle(String s)
	{
		String title=s;
	}
	String getTitle()
	{
		return getTitle();
	}
}
	
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String title= sc.nextLine();
		Mymovie1 m=new Mymovie1();
		m.setTitle("title");
		System.out.println("the title is :"+m.getTitle());

	}
	
}



