import java.util.HashMap;
import java.util.Map;

public class Main9 {

	public static void main(String[] args) {
		Map<Character,String> map= new HashMap<Character,String>();
		map.put('a', "Anil");
		map.put('b', "Babu");
		map.put('c', "Charan");
		map.put('d', "Dharani");
		//map.remove("Babu");
		map.remove('b');
		System.out.println(map);

	}

}
