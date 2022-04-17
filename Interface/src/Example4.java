interface Sayable{
	default void say()
	{
		System.out.println("Hello this is default method");
	}
	void sayMore(String msg);
}
 class defaultMethods implements Sayable
 {

	@Override
	public void sayMore(String msg) {
		System.out.println("work is worship");
		
	}
	 
 }
public class Example4 {

	public static void main(String[] args) {
		 defaultMethods d= new  defaultMethods();
		 d.say();
		 d.sayMore("work is worship");

	}

}
