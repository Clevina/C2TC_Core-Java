

import java.util.ArrayList;



class Demo
{
	public void show()
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(4);
		list.add(7);
		list.add(1);
		for(int number:list)
		{
			System.out.println(number+" ");
		}
	}
	
}
public class Main{

	public static void main(String[] args) {
		Demo demo= new Demo();
		demo.show();

	}

}
