import java.util.LinkedHashSet;

public class Main2 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedset1= new LinkedHashSet<Integer>();
		linkedset1.add(1);
		linkedset1.add(2);
		linkedset1.add(3);
		linkedset1.add(4);
		linkedset1.add(5);
		System.out.println(linkedset1);
		LinkedHashSet<Integer> linkedset2= new LinkedHashSet<Integer>();
		linkedset2.add(1);
		linkedset2.add(2);
		linkedset2.add(3);
		System.out.println(linkedset2);
		linkedset1.retainAll(linkedset2);
		System.out.println(linkedset1);
	}

}
