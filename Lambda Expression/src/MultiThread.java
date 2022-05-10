class Eclipse7 implements  Runnable
{
	public void run()
	{
		System.out.println("I am run method");
	}
}
public class MultiThread {

	public static void main(String[] args) {
		Eclipse7 e7= new Eclipse7();
		Thread t= new Thread(e7);
		t.start();

	}

}
