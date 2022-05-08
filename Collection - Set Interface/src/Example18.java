import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Example18 {

	public static void main(String[] args) {
		TreeSet<String>ts= new TreeSet<String>(Arrays.asList("red","orange","blue","green","white","brown","yellow","black"));
		System.out.println(ts);								//6	    //5		//2		//4		//7		//3		//8		//1
		
		Set<String>subSet= ts.subSet("green","yellow");//green,orange,red,white
		System.out.println("Sub set :"+subSet);
		subSet=ts.subSet("black","brown");//black.blue
		System.out.println("Sub set :"+subSet);
		
	}

}
