package com.staticMethod;



public class Student {

	int rollno;
	String name;
	static String college="ITS";
	//static {    static block
		//college="ITS";
	//}
	public Student(int r,String n)
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


	public static void main(String[] args) {
		Student s1=new Student(111,"KARAN");
		Student s2=new Student(222,"ARYAN");
		s1.change();
		s1.display();
		s2.display();
		
	}

}
