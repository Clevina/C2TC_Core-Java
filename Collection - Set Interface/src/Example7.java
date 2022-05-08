import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;

public class Example7 {

	public static void main(String[] args) {
		TreeSet<String>ts= new TreeSet<String>(Arrays.asList("red","orange","blue","green","white","brown","yellow","black"));
		System.out.println(ts);								//6	    //5		//2		//4		//7		//3		//8		//1
		Set<String>subset=ts.subSet("GREEN", "WHITE");
		System.out.println("Sub Set:"+subset);
		subset=ts.subSet("green", "brown");
		System.out.println("Sub Set:"+subset);
		
	}

}
