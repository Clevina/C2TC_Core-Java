import java.util.regex.Pattern;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("+quantifier...........");
		System.out.println(Pattern.matches("[amn]+","a"));//t
		System.out.println(Pattern.matches("[amn]+","aaa"));//t
		System.out.println(Pattern.matches("[amn]+","aammmnn"));//t
		System.out.println(Pattern.matches("[amn]+","aazzta"));//f
		System.out.println("+quantifier...........");
		System.out.println(Pattern.matches("[amn]*","ammmna"));//t

	}

}
