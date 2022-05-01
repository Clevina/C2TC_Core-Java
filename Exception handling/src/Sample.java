import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try
		{
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		int sum=n1/n2;
		System.out.println("Sum is:"+sum);
		}
		catch(Exception e)
		{
			System.out.println("You cant do that");
		}
	}
}
