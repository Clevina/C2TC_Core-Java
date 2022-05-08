import java.util.SortedSet;
import java.util.TreeSet;

public class Example5 {

	public static void main(String[] args) {
		SortedSet<String> set= new TreeSet();
		set.add("Technical");
		set.add("Technology");
		set.add("quiz");
		set.add("code");
		System.out.println(set);
		SortedSet<String> beforeQuiz= set.headSet("quiz");//strictly less
		SortedSet<String> afterCode= set.tailSet("quiz");//strictly greater and equal to
		System.out.println(beforeQuiz);
		System.out.println(afterCode);
		System.out.println(set);
	}

}
