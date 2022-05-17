import java.util.regex.Pattern;

public class Example3 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[amn]","abcd"));//f
		System.out.println(Pattern.matches("[amn]","a"));//t
		System.out.println(Pattern.matches("[amn]","ammmna"));//f

	}

}
