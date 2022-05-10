
class Eclispe4 extends Thread
{
	public void run()
	{
		System.out.println("Eclipse thread ID is :"+Thread.currentThread().getId());
		System.out.println("Eclipse thread Priority is :"+Thread.currentThread().getPriority());
		
	}
}
class PPT4 extends Thread
{
	public void run()
	{
		System.out.println("PPT thread ID is :"+Thread.currentThread().getId());
		System.out.println("PPT thread Priority is :"+Thread.currentThread().getPriority());
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		Eclispe4 e= new Eclispe4();
		e.start();
		e.setPriority(7);
		PPT4 p= new PPT4();
		p.start();
		p.setPriority(3);
	

	}

}
