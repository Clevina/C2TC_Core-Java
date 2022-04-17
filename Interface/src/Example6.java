
interface FirstInterface{
	public void myMethod();
}
interface SecondInterface{
	public void myOtherMethod();
}
class Main2 implements FirstInterface,SecondInterface
{

	@Override
	public void myMethod() {
		System.out.println("firstInterface");	
	}

	@Override
	public void myOtherMethod() {
		System.out.println("SecondInterface");	
	}
	
}
public class Example6 {

	public static void main(String[] args) {
		Main2 m2= new Main2();
		m2.myMethod();
		m2.myOtherMethod();

	}

}


