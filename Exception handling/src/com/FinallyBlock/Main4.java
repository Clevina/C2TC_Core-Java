package com.FinallyBlock;

public class Main4 {

	public static void main(String[] args) {
		try
		{
			String arr[]=new String[10];
			arr=null;
			arr[0]="one";
			System.out.println(arr[0]);
		}
		/*catch(Exception e)
		{
			System.out.println("Exception");
		}*/
		
		  catch(NullPointerException e) { System.out.println("null pointer excepton");
		  }
		 

	}

}
