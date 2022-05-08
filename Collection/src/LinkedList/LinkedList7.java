package LinkedList;

import java.util.LinkedList;

public class LinkedList7 {

	public static void main(String[] args) {
		LinkedList<String>ll= new LinkedList<String>();
		ll.add("Ravi");
		ll.add("vijay");
		ll.add("Ajay");
		ll.add("Harsh");
		ll.add("harsh");
		ll.add("Amit");
		ll.remove(0);
		System.out.println("After invoking remove(index) method:"+ll);

	}

}
