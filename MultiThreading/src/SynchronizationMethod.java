class counter
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}
public class SynchronizationMethod {

	public static void main(String[] args) throws InterruptedException {
		counter c= new counter();
		Thread t1= new Thread(new Runnable() {
			public void run()
			{
				c.increment();
			}
		});
		t1.start();
		t1.join();
		Thread t2= new Thread(new Runnable() {
			public void run()
			{
				c.increment();
			}
		});
		t2.start();
		t2.join();
		Thread t3= new Thread(new Runnable() {
			public void run()
			{
				c.increment();
			}
		});
		t3.start();
		t3.join();
		System.out.println(c.count);
	}

}
