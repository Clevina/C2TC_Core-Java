package LinkedList;

import java.util.LinkedList;

public class LinkedList5 {

	public static void main(String[] args) {
		LinkedList<String>ll= new LinkedList<String>();
		ll.add("Ravi");
		ll.add("vijay");
		ll.add("Ajay");
		ll.addLast("Harsh");
		System.out.println("After invoking addLast() method:"+ll);
	}

}
