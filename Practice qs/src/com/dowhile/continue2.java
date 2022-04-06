package com.dowhile;

public class continue2 {

	public static void main(String[] args) {
		int first=5,second=20;
		do
		{
			if(first++>--second)
			{//15>10
				continue;
			}
		}while(first<15);//14<15
		System.out.println("first:" +first+ "second:"+second);

	}

}
