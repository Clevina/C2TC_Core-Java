package com.constructorOverloading;
class Student
{
	int id;
	String name;
	int age;
	Student(int i, String n)
	{
		id=i;
		name=n;
	}
	Student(int i, String n, int a)
	{
		id=i;
		name=n;
		age=a;
	}
	public void display() {
		System.out.println(id+ " " +name+" "+age);
		
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Student s1= new Student(111,"KARAN",20);
		Student s2= new Student(222,"ARYAN");
		s1.display();
		s2.display();
	}

}
