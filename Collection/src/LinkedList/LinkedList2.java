package LinkedList;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList<String>ll= new LinkedList<String>();
		ll.add("Ravi");
		ll.add("vijay");
		LinkedList<String>ll2= new LinkedList<String>();
		ll2.add("Sonoo");
		ll2.add("hanumat");
		ll.addAll(ll2);
		System.out.println("After invoking addAll method:"+ll);

	}

}
