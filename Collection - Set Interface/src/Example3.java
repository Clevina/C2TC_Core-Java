import java.util.SortedSet;
import java.util.TreeSet;

public class Example3 {

	public static void main(String[] args) {
		SortedSet<String> set= new TreeSet();
		set.add("Technical");
		set.add("Technology");
		set.add("quiz");
		set.add("code");
		System.out.println("Sorted set :"+set);
		System.out.println("First :"+set.first());
		System.out.println("Last :"+set.last());
		

	}

}
