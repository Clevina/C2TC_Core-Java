package com.inheritance;
 
class Addition{
	public void add(int a,int b)
	{
		System.out.println("Addition is :"+(a+b));
	}
}
class subtraction extends Addition{
	public void sub(int a,int b)
	{
		System.out.println("subtraction is :"+(a-b));
	}
}
class multiplication extends subtraction{
	public void multiply(int a,int b)
	{
		System.out.println("multiplication is is :"+(a*b));
	}
}
class division extends multiplication{
	public void div(int a,int b)
	{
		System.out.println("division is :"+(a/b));
	}
	public void CallAllMethods()
	{
		add(2,3);
		sub(4,3);
		multiply(3,4);
		div(8,6);
	}
}
class calculation extends division
{
}
public class Demo4 {

	public static void main(String[] args) {
		division d= new division();
		d.CallAllMethods();
	}

}




