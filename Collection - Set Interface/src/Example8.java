import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;

public class Example8 {

	public static void main(String[] args) {
		TreeSet<String>ts= new TreeSet<String>(Arrays.asList("red","orange","blue","green","white","brown","yellow","black"));
		System.out.println(ts);	
		
		Set<String>subSet= ts.subSet("green",false,"white",true);
		System.out.println("Sub set :"+subSet);
		subSet=ts.subSet("green",true,"white",true);
		System.out.println("Sub set :"+subSet);
		subSet=ts.subSet("green",false,"white",false);
		System.out.println("Sub set :"+subSet);
		
		
	}

}
