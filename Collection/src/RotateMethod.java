import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateMethod {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("practice");
		list.add("code");
		list.add("every");
		list.add("day");
		System.out.println("Original list:"+list);
		Collections.rotate(list,2);
		
		System.out.println("Rotated list:"+list);

	}

}
//1-day,p,code,every
//2-every,day,prac,code
//3-code,every,day,prc
//4-p,code,ever,day