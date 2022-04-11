package com.protectedModifiers1;//outside the package

import com.protectedModifiers.test;

public class test3 {

	public static void main(String[] args) {
		test t1=new test();
		t1.show();
		System.out.println(t1.i);

	}

}
