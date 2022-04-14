package com.abstractExample;
abstract class Movie
{
	abstract void setTitle();
}
class Mymovie extends Movie
{

	@Override
	void setTitle() {
		System.out.println("The title is : Hary Potter");
		
		
	}
	
}
public class Exercise {

	public static void main(String[] args) {
		Mymovie Mybook= new Mymovie();
		Mybook.setTitle();

	}

}
