package com.staticMethod;
class Student3 {

	int rollno;
	String name;
	static String college="ITS";
	//static {    static block
		//college="ITS";
	//}
	public Student3(int r,String n)
	{
		rollno=r;
		name=n;
	}
	static void change()//method
	{
		college="IIT";
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}

public class Method {

	public static void main(String[] args) {
		Student3 s1=new Student3(111,"KARAN");
		Student3 s2=new Student3(222,"ARYAN");
		s1.change();
		s1.display();
		s2.display();

	}

}
