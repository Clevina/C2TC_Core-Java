

public class Example3 {
public enum Season2
{
	SUMMER, SPRING,AUTUMN, WINTER
}
	public static void main(String[] args) {
		for(Season2 s:Season2.values())
		{
			System.out.println(s);
		}
		System.out.println("Value of WINTER is:"+Season2.valueOf("WINTER"));
		System.out.println("Index of WINTER is:"+Season2.valueOf("WINTER").ordinal());
		System.out.println("Index of WINTER is:"+Season2.valueOf("SUMMER").ordinal());
	}

}
