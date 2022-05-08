import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillMethod {

	public static void main(String[] args) {
		List<String> arrlist= new ArrayList<>();
		arrlist.add("java");
		arrlist.add("Technical");
		arrlist.add("webinar");
		System.out.println("List element before Replacements:"+arrlist);
		Collections.fill(arrlist, "technology");
		System.out.println("List element aftter Replacements:"+arrlist);

	}

}
