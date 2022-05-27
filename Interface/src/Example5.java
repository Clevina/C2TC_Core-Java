interface Interface1{
	public void myMethod();
}
interface Interface2{
	public void myMethod();
}
class Main1 implements Interface1,Interface2
{

	@Override
	public void myMethod() {
		System.out.println("Implementing more than one interfaces");	
	}

	
	
}
public class Example5 {

	public static void main(String[] args) {
		Main1 m= new Main1();
		m.myMethod();
		

	}

}
