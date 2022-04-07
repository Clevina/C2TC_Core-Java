package com.thiskeyword;

public class Demo {

	void m() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println(d1);
		d1.m();
		
	}

}
