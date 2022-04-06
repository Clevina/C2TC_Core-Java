package com.dowhile;

public class breakdowhile {

	public static void main(String[] args) {
		int i=1;
		
		do
		{
			if(i==5)
			{
				i++;//6
				break;
			}
			System.out.println(i);//1,2,3,4
			i++;//2,3
		}while(i<=10);//2<=10..
		System.out.println(i);

	}

}
