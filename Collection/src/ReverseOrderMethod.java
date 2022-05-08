import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrderMethod {

	public static void main(String[] args) {
		List<Integer>list= new ArrayList<>();
		list.add(80);
		list.add(05);
		list.add(32);
		list.add(2);
		System.out.println("Original list:"+list);
		Collections.sort(list,Collections.reverseOrder());
		//Collections.reverse(list);
		System.out.println("Reverse list:"+list);

	}

}
//2,5,32,80
//80,32,5,2