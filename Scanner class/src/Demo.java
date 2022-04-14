import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float sum=0, j=0;
		System.out.println("enter the number");
		float n=sc.nextInt();
		while(j<n)
		{
			
			float num=sc.nextInt();
			sum+=num;
			j++;
		}
		
		float mean=sum/n;
		System.out.println("Mean:"+mean);

	}

}
