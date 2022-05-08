import java.util.ArrayList;

public class IsEmptyMethod {

	public static void main(String[] args) {
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Bottle");
		a1.add("water");
		a1.add("liquid");
		a1.add("oil");
		System.out.println(a1);
		System.out.println(a1.get(1));
		System.out.println(a1.contains("oil"));
		a1.add(2,"salt");
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println(a1.indexOf("oil"));
		System.out.println(a1.size());
		
	}

}
