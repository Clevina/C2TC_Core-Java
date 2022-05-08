import java.util.LinkedHashSet;

public class Example12 {

	public static void main(String[] args) {
		LinkedHashSet list= new LinkedHashSet();
		list.add(10);
		list.add("Focus");
		list.add(10.00);
		list.add('F');
		list.add(100);
		System.out.println(list);
	}

}
