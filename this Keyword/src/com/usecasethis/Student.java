package com.usecasethis;

public class Student {
	int rollno;
	String name;
	float fee;
	
	Student(int rollno,String name,float fee)
	{
		this.rollno=rollno;//refer current class of instance variable
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name);
	}
class testThis{
	public static void main(String[] args) {
		Student s1=new Student(111,"Karan",2000f);
		Student s2=new Student(222,"Aryan",3000f);
		s1.display();
		s2.display();
	}

}
}