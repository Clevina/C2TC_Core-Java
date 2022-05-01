
public class Example13 {

	public static void main(String[] args) {
		try
		{
			int i=Integer.parseInt("Thor");
		}
		catch(Exception e)
		{
			System.out.println("This block handles all type of exception");
		}
		/*
		 * catch(NumberFormatException e) {
		 * System.out.println("This block handles NumberFormatException"); }
		 */
	}

}
