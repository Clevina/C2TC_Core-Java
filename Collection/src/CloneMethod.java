import java.util.ArrayList;

public class CloneMethod {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		Object cloneList;
		a1.add("Java");
		a1.add("C++");
		a1.add("Count");
		System.out.println(a1);
		cloneList=a1.clone();
		//a1.clone();
		System.out.println(cloneList);
		//System.out.println(a1);


	}

}
