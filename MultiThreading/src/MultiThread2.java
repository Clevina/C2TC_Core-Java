class Eclispe2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Eclipse thread ID is :"+Thread.currentThread().getId());
		}	
	}
}
class PPT2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("PPT thread ID is :"+Thread.currentThread().getId());
		}
		
		
	}
}

public class MultiThread2 {

	public static void main(String[] args) {
		Eclispe2 e= new Eclispe2();
		Thread t= new Thread(e);
		t.start();
		PPT2 p= new PPT2();
		Thread t1= new Thread(p);
		t1.start();

	}

}
