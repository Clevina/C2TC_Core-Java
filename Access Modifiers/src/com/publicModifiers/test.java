package com.publicModifiers;//within the class

public class test {
	public int i=10;
	public void show()
	{
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		test t1=new test();
		t1.show();
		System.out.println(t1.i);
	

	}

}
