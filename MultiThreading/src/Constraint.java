
class Eclispe5 extends Thread
{
	public void run()
	{
		System.out.println("Eclipse thread ID is :"+Thread.currentThread().getId());
		System.out.println("Eclipse thread Priority is :"+Thread.currentThread().getPriority());
		
	}
}
class PPT5 extends Thread
{
	public void run()
	{
		System.out.println("PPT thread ID is :"+Thread.currentThread().getId());
		System.out.println("PPT thread Priority is :"+Thread.currentThread().getPriority());
	}
}
public class Constraint {

	public static void main(String[] args) {
		Eclispe5 e= new Eclispe5();
		e.start();
		e.setPriority(Thread.MIN_PRIORITY);
		PPT5 p= new PPT5();
		p.start();
		p.setPriority(Thread.MAX_PRIORITY);
	

	}

}
