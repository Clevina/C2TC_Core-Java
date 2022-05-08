import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetVsSortedSet {

	public static void main(String[] args) {
		HashSet obj = new HashSet();
		obj.add(1);
		obj.add("QUEUE");
		obj.add("Fine");
		obj.add(86.78);
		System.out.println(obj);
	}

}
class SortedSet2
{
	public static void main(String[] args) {
		SortedSet obj= new TreeSet();
		obj.add(13);
		obj.add(34.62);
		obj.add(6);
		obj.add(21);
		obj.add("STRING");
		obj.add('c');
		System.out.println(obj);
	}
}