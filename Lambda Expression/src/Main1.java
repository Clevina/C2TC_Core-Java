interface Sayable1
{
	public void say();
	
}
public class Main1 {

	public static void main(String[] args) {
	Sayable1 s=() ->{
	for(int i=0;i<5;i++)
	System.out.println("I have nothing to say");};
	s.say();

	}

}
