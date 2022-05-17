

enum Season
{
	
	SUMMER(10), WINTER(5),SPRING(15), AUTUMN(20);
	int j;
	Season(int value)
	{
		this.j= value;
	}
}
public class Example6 {

	public static void main(String[] args) {
		for(Season s: Season.values())
		{
			System.out.println(s+" "+s.j);
		}

	}

}
