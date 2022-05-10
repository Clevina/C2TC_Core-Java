interface Lambda
{
	public void demo();
}
public class MultiThread1 {

	public static void main(String[] args) {
		new Thread(() ->{
			System.out.println("I am run method");
		}).start();

}
}