package LinkedList;

import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		LinkedList<String>ll= new LinkedList<String>();
		ll.add("Ravi");
		ll.add("vijay");
		LinkedList<String>ll3= new LinkedList<String>();
		ll3.add("Sonoo");
		ll3.add("hanumat");
		ll.addAll(1,ll3);
		System.out.println("After invoking addAll method:"+ll);


	}

}
