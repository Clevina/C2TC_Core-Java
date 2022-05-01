
public class Example9 {

	public static void main(String[] args) {
		try
		{
			int [] arr= new int[5];
			arr[7]=100/20;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent exception occurrs");
		}
		System.out.println("rest of the code");

	}

	}


