interface Inf1{
	public void Method();
	
}
 class demo1 implements Inf1
{
	public void Method()
	{
		System.out.println("method");
		}
	
}
public class Demo {

	public static void main(String[] args) {
		demo1 d1= new demo1();
		d1.Method();
		
	}

}
