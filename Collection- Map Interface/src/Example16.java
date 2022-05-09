import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Example16 {

	public static void main(String[] args) {
		NavigableMap<Integer,String> b1= new TreeMap<Integer,String>();
		//SortedMap<Integer,String> b2= new TreeMap<Integer,String>();
		b1.put(4, "Tamilnadu");
		b1.put(2, "Gujarat");
		b1.put(6, "Orissa");
		b1.put(1, "Kerala");
		System.out.println(b1);
		System.out.println(b1.descendingKeySet());
		//System.out.println(b2.descendingKeySet());


	}

}
