package LinkedList;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String>ll= new LinkedList<String>();
		ll.add("Ravi");
		ll.add("vijay");
		ll.add("Ajay");
		ll.add(1,"Gaurav");
		System.out.println("After invoking add(int index,E element) method:"+ll);
	}

}
