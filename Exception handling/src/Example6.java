
public class Example6 {

	public static void main(String[] args) {
		Example6 exp= new Example6();
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
	catch(NullPointerException nullexp)
	{
		System.out.println("We have  an exception-"+nullexp);
	}
	System.out.println("Outside ry - catch block");
}
}