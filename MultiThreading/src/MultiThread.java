class Eclispe extends Thread
{
	public void run()
	{
		System.out.println("Eclipse thread ID is :"+Thread.currentThread().getId());
		
	}
}
class PPT extends Thread
{
	public void run()
	{
		System.out.println("PPT thread ID is :"+Thread.currentThread().getId());
		
	}
}
class MultiThread {
	public static void main(String[] args) {
		Eclispe e= new Eclispe();
		e.run();
		PPT p= new PPT();
		p.start();
	}

}
