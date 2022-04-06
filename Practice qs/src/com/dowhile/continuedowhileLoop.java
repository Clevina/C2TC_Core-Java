package com.dowhile;

public class continuedowhileLoop {

	public static void main(String[] args) {
		int i=1;
		do
		{
			if(i==5)
			{
				i++;//6
				continue;
			}
			System.out.println(i);//1,2,3,4,6,7,8,9,10
			i++;//2,3,4,5,7,8,9,
		}while(i<=10);

	}

}
