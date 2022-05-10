import java.util.ArrayList;

public class ForEachMethod {

	public static void main(String[] args) {
		ArrayList<String>arr= new ArrayList<String>();
		arr.add("Lekha");
		arr.add("Leema");
		arr.add("Pooja");
		arr.add("Hema");
		for(String a:arr)
		{
			System.out.println(a);
		}
	}

}
