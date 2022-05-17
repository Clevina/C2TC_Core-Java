import java.util.regex.Pattern;

public class Example6 {

	public static void main(String[] args) {
		System.out.println("metacharacters D.....");
		System.out.println(Pattern.matches("\\D", "abc"));//f
		System.out.println(Pattern.matches("\\D", "1"));//f
		System.out.println(Pattern.matches("\\D", "4443"));//f
		System.out.println(Pattern.matches("\\D", "323abc"));//f
		System.out.println(Pattern.matches("\\D", "m"));//t
		System.out.println("metacharacters D with quantifiers.....");
		System.out.println(Pattern.matches("\\D*", "mak"));//t
	}

}
