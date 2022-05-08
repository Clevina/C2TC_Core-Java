package LinkedList;

import java.util.LinkedList;

public class ContainsMethod {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<String>();
		list.add("River");
		list.add("sea");
		list.add("salt");
		list.add("liquid");
		System.out.println(list);
		String s= "liquid";
		boolean c= list.contains("liquid");
		/*
		 * boolean a=list.contains("sugar"); System.out.println(c);
		 * System.out.println(a);
		 */
		if(c)
		{
		System.out.println(list.indexOf(s));
		}

	}

}
