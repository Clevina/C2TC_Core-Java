package PracticeQuestions;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ShuffleMethod {

	public static void main(String[] args) {
		LinkedList<Integer>list= new LinkedList<Integer>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			list.add(sc.nextInt());
		}
		//System.out.println(list);
		Collections.shuffle(list);
		System.out.println("Result is:" +list);
		
	}

}
