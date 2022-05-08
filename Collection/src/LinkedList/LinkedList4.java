package LinkedList;

import java.util.LinkedList;

public class LinkedList4 {

	public static void main(String[] args) {
		LinkedList<String>ll= new LinkedList<String>();
		ll.add("Ravi");
		ll.add("vijay");
		ll.add("Ajay");
		ll.addFirst("Lokesh");
		System.out.println("After invoking addFirst() method:"+ll);

	}

}
