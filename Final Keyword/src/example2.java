class Bike1
{
	final void run()
	{
		System.out.println("running");
	}
}
class Honda extends Bike1
{
	void run1()
	{
		System.out.println("Running safely with 100kmph");
	}
}
public class example2 {

	public static void main(String[] args) {
		Honda h= new Honda();
		
		h.run1();
		h.run();
	}

}
