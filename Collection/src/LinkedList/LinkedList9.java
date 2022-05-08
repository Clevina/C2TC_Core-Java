package LinkedList;

import java.util.LinkedList;

public class LinkedList9 {

	public static void main(String[] args) {
		LinkedList<String>ll= new LinkedList<String>();
		ll.add("Ravi");
		ll.add("vijay");
		ll.add("Ajay");
		ll.add("Harsh");
		ll.add("Harsh");
		ll.add("Amit");
		ll.removeFirstOccurrence("Harsh");
		System.out.println("After invoking removeFirstOccurrence() method:"+ll);

	}

}
