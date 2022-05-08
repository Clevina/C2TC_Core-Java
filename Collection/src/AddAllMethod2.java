import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddAllMethod2 {

	public static void main(String[] args) {
		LinkedList<Integer> lang= new LinkedList<>();
		lang.add(1);
		lang.add(2);
		lang.add(6);
		lang.add(8);
		Iterator it= lang.iterator();
		Collections.reverse(lang);
		Collections.sort(lang);
		while(it.hasNext())
			System.out.println(it.next() + " ");
		
		}

}
