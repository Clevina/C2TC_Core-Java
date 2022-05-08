package PracticeQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main3 {

	public static void main(String[] args) {
		List<String> i= new ArrayList<String>();
		i.add("a");
		i.add("b");
		ListIterator<String> z= i.listIterator();
		while(z.hasNext()) {
			System.out.println(z.next());
			z.previous();
		}
	}

}
