

public class Example2 {
public enum Season1
{
	SUMMER,SPRING,WINTER,AUTUMN
}
	public static void main(String[] args) {
		for(Season1 s:Season1.values())
		{
			System.out.println(s);
		}

	}

}
