import java.util.ArrayList;

public class ForEachMethod1 {

	public static void main(String[] args) {
		ArrayList<String>arr= new ArrayList<String>();
		arr.add("Lekha");
		arr.add("Leema");
		arr.add("Pooja");
		arr.add("Hema");
		arr.forEach(temp->System.out.println(temp));

	}

}
