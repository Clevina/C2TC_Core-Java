package PracticeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class demo
{
	public void show()
	{
		ArrayList<String> list= new ArrayList<String>();
		list.add("banana");
		list.add("apple");
		Iterator itr= list.iterator();
		Collections.sort(list);
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
	}
}
public class Example3 {

	public static void main(String[] args) {
	demo d= new demo();
	d.show();
	}

}
