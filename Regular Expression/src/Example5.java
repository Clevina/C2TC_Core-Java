import java.util.regex.Pattern;

public class Example5 {

	public static void main(String[] args) {
		System.out.println("metacharacters d.....");
		System.out.println(Pattern.matches("\\d", "abc"));//f
		System.out.println(Pattern.matches("\\d", "1"));//t
		System.out.println(Pattern.matches("\\d", "4443"));//f
		System.out.println(Pattern.matches("\\d", "323abc"));//f
	}

}
