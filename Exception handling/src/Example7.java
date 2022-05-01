
public class Example7 {

	public static void main(String[] args) {
		Example7 exp= new Example7();
		try {
			exp.meth1();
		    }
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticeException thrown by meth1() method is caught in main() method");
		}
		
	}


public void meth1()
{
	try
	{
		System.out.println(100/0);
	}
	catch(Exception nullexp)
	{
		System.out.println("We have  an exception-"+nullexp);
	}
	System.out.println("Outside try - catch block");
}


	}


