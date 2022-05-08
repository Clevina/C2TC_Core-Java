import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Example9 {

	public static void main(String[] args) {
		String[] strArr= {"one","two","three","four","four","five"};
		List<String>tmpList=Arrays.asList(strArr);
		TreeSet<String>unique= new TreeSet<String>(tmpList);
		System.out.println(unique);
	}

}
