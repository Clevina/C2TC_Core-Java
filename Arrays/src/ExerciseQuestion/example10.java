package ExerciseQuestion;

public class example10 {

	public static void main(String[] args) {
	int arr[]= {1,0,1,1,1,0,0};
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==1)
		{
			sum=sum+3;//3/5/8/11
		}
		else
		{
			sum=sum-1;//2//10/9
			
		}
	}
	System.out.println("total marks obtained is :" +sum);

	}

}
