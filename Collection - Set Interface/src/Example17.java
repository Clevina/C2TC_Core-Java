import java.util.TreeSet;

public class Example17 {

	public static void main(String[] args) {
		TreeSet<Integer> set= new TreeSet<Integer>();
		set.add(3);
		set.add(67);
		set.add(90);
		set.add(678);
		set.add(0);
		System.out.println("Initial set:"+set);//0,3,67,90,678
		System.out.println("Head set :"+set.tailSet(90));//90,678


	}

}
