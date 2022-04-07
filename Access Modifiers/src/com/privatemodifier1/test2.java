package com.privatemodifier1;//outside the package by subclass only

import com.privatemodifier.test;

public class test2 extends test{
	

	public static void main(String[] args) {
		test2 t2=new test2();
		t2.show();
		System.out.println(t2.i);
		
		

	}

}
