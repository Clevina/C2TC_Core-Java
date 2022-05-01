
public class Handling {

	public static void main(String[] args) {
		try
		{
		System.out.println("Learn coding");
		int a=20, b=0,c;
		c=a/b;
		System.out.println(c);
		System.out.println("Like share");
		}
		
		  catch(ArithmeticException e) 
		{ 
			  System.out.println("Cant divide by zero");
		}
		 
		finally
		{
			System.out.println("Subscribe");
		}
		System.out.println("Main method ended");
	}

}
