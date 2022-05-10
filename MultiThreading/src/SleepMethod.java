class Eclipse6 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Eclipse Thread ID is:"+Thread.currentThread().getId());	
			try
			{
				sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
}
public class SleepMethod {

	public static void main(String[] args) {
		Eclipse6 e= new Eclipse6();
		e.start();

	}

}
