package LinkedList;

import java.util.LinkedList;

public class LinkedList10 {

	public static void main(String[] args) {
		LinkedList<String>ll= new LinkedList<String>();
		ll.add("Harsh");
		ll.add("vijay");
		ll.add("Ajay");
		ll.add("Harsh");
		ll.add("Ravi");
		ll.add("Amit");
		ll.removeLastOccurrence("Harsh");
		System.out.println("After invoking removeLastOccurrence() method:"+ll);

	}

}
