package PracticeQuestions;

import java.util.LinkedList;

public class PollMethod {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.add("Gem");
		list.add(4);
		list.add("GREY");
		list.add("8");
		System.out.println("The initial list is:"+list);
		System.out.println(list.poll());
		System.out.println("Head of the list is:"+list);

	}

}
