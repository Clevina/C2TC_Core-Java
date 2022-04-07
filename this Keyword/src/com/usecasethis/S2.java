package com.usecasethis;//Passing argument in method

public class S2 {
	void m(S2 a)
	{
		System.out.println("method is invoked");
	}
	void p()
	{
		m(this);
	}

	public static void main(String[] args) {
	S2 s2=new S2();
	s2.p();

	}

}
