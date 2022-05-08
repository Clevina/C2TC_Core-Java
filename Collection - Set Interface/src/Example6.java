import java.util.TreeSet;

public class Example6 {

	public static void main(String[] args) {
		TreeSet<String> set= new TreeSet<String>();
		set.add("Tokiyo");//3
		set.add("Nairobi");//2
		set.add("rio");//5
		set.add("Berlin");//1
		set.add("denver");//4
		System.out.println("Sorted set:"+set);
	}

}
