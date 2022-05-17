
public class Example5 {
enum DAY
{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURDSDAY, FRIDAY, SATURDAY
}
	public static void main(String[] args) {
		DAY day= DAY.TUESDAY;
		switch(day)
		{
		case SUNDAY:
			System.out.println("Moving towards Monday");
			break;
		case FRIDAY:
			System.out.println("Hurrayy Its a weekend");
			break;
		default:
			System.out.println("other day");
		}

	}

}
