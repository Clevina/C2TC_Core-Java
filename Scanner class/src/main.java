import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the gender");
		char gender=sc.next().charAt(0);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the mobileno");
		long mobileno=sc.nextLong();
		System.out.println("Enter the cgpa");
		double cgpa=sc.nextDouble();
		System.out.println("Name :" +name);
		
		System.out.println("Gender :" +gender);
		
		System.out.println("Age :" +age);
		
		System.out.println("Mobile Number :" +mobileno);
		
		System.out.println("CGPA :" +cgpa);
		
		

	}

}
