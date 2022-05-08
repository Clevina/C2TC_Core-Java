package LinkedList;

import java.util.LinkedList;

public class LinkedList8 {

	public static void main(String[] args) {
		LinkedList<String>ll= new LinkedList<String>();
		ll.add("Ravi");
		ll.add("vijay");
		ll.add("Ajay");
		ll.add("Harsh");
		ll.add("harsh");
		ll.add("Amit");
		ll.removeFirst();
		System.out.println("After invoking removeFirst() method:"+ll);
		ll.removeLast();
		System.out.println("After invoking removeLast() method:"+ll);

	}

}
