package ExerciseQuestion;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number you want in array");
		int n= sc.nextInt();
		int arr[]= new int[5];
		System.out.println("Enter all the elements");
		for(int i=0;i<5;i++)
		{
			arr[i]= sc.nextInt();
		}
		int max=arr[0];
		 for(int i = 0; i < 5; i++)//12,45,78,90,76
	        {
	            if(max < arr[i])
	            {
	                max = arr[i];
	            }
	        }
		 System.out.println("Maximum value:"+max);
	}

}
