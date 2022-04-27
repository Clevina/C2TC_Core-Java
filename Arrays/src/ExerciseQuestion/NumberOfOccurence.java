package ExerciseQuestion;

import java.util.Scanner;

public class NumberOfOccurence {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count=0;;
		System.out.println("Enter number element you want in array");
		int n= sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter all the elements");
		for(int i= 0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the number you want to find the count of occcurence");//12 ,34,56,12,56
		int x= sc.nextInt();
		
		 for(int i = 0; i < 5; i++)
	        {
	            if(arr[i] == x)
	            {
	                count++;//1+1=2
	            }
	        }
	        System.out.println("Number of Occurrence of the Element:"+count);

	}

}
