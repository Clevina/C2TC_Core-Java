package com.ThrowsBlock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

class ListTooLargeException extends RuntimeException
{
	ListTooLargeException(String message)
	{
		System.out.println(message);
	}
}
public class Example5 {
public void analyze(List<String>data)
{
	if(data.size()>50)
	{
		throw new ListTooLargeException("List cant exceed 50 items!");
	}
}
	public static void main(String[] args) {
		
		Example5 exp= new Example5();
		List<String>data= new ArrayList<>(Collections.nCopies(100, "Customer Details"));
		exp.analyze(data);

	}

}
