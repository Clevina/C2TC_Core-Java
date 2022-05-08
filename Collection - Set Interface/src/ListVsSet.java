import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ListVsSet {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add("Object");
		obj.add("Method");
		obj.add("Method");
		obj.add(10.0);
		obj.add(100);
		System.out.println(obj);

	}

}
class Set {

	public static void main(String[] args) {
		LinkedHashSet obj = new LinkedHashSet();
		obj.add("Object");
		obj.add("Method");
		obj.add("Method");
		obj.add(10.0);
		obj.add(100);
		System.out.println(obj);

	}

}