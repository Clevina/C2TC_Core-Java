import java.util.ArrayList;
import java.util.List;

public class Method{

	public static void main(String[] args) {
		List<Integer> val= new ArrayList<>();
		val.add(0);
		val.add(1);
		val.add(23);
		val.add(34);
		val.add(45);
		for(Integer e:val)
		{
			System.out.println(e);
		}
		System.out.println("ArrayList: "+val);
	}

}
