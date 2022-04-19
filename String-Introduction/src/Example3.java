
public class Example3 {

	public static void main(String[] args) {
		String str="Hello";
		String str1="Hello";
		String s1= new String("Hello");
		String s2= new String("Hello");
		System.out.println((str==str1));
		System.out.println((str1==s1));
		System.out.println((s1==s2));
	}

}
