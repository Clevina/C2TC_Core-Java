package com.abstractExample;
abstract class Shape
{
	abstract void draw();
		
	
}
 class rectangle extends Shape
 {
	 void draw()
	 {
		System.out.println("drawing rectangle"); 
	 }
 }
 class circle extends Shape
 {
	 void draw()
	 {
		 System.out.println("Drawing circle");
	 }
 }
public class Demo1 {

	public static void main(String[] args) {
		Shape s=new rectangle();
		s.draw();
		Shape c=new circle();
		c.draw();

	}

}
