

public class Example4 {
public enum Season3
{
	SUMMER(10), WINTER(5),SPRING(15), AUTUMN(20);
	int j;
	Season3(int value)
	{
		this.j= value;
	}
}
	public static void main(String[] args) {
		for(Season3 s: Season3.values())
		{
			System.out.println(s+" "+s.j);
		}
	}

}
