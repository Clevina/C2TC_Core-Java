import java.util.regex.Pattern;

public class Example2 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches(".s", "as"));//t
		System.out.println(Pattern.matches(".s", "mk"));//f
		System.out.println(Pattern.matches(".s", "mst"));//f
		System.out.println(Pattern.matches(".s", "amns"));//f
		System.out.println(Pattern.matches(".s", "mas"));//f
	}

}
