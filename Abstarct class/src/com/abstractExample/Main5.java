package com.abstractExample;
abstract  class dress
{
    void type()
   {
	   System.out.println("Its a mens wear");
   }
}

class d extends dress{
	
}
public class Main5 {

	public static void main(String[] args) {
		dress d= new d();
		d.type();

	}

}
