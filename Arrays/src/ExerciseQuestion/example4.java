package ExerciseQuestion;

public class example4 {
	public static void function(int array[][])
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int array[][]= {{42,2,23},{5,60,12},{19,10,11}};
		function(array);
	}
//42 2 23
//5,60,12
//19,10,11
}
