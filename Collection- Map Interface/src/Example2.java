import java.util.HashMap;

public class Example2 {

	public static void main(String[] args) {
		HashMap<Integer,String>hash_map= new HashMap<Integer,String>();
		hash_map.put(1, "eat");
		hash_map.put(2, "mobile");
		hash_map.put(3, "sleep");
		hash_map.put(4, "repeat");
		System.out.println("Initial map:"+hash_map);
		HashMap<Integer,String>new_map= new HashMap<Integer,String>();
		new_map.putAll(hash_map);
		System.out.println(new_map);
	}

}