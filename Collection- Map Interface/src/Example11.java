import java.util.NavigableMap;
import java.util.TreeMap;

public class Example11 {

	public static void main(String[] args) {
		NavigableMap<Integer,String> b1= new TreeMap<Integer,String>();
		b1.put(4, "Tamilnadu");
		b1.put(2, "Gujarat");
		b1.put(6, "Orissa");
		b1.put(1, "Kerala");
		b1.put(5, "Telegana");
		b1.put(7, "Karanataka");
		b1.put(8, "Mumbai");
		b1.put(3, "Meghalaya");
		System.out.println(b1);
		System.out.println(b1.tailMap(5));
	}

	}


