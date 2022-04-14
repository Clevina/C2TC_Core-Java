class Animal2{
	Animal2()
	{
		System.out.println("animal is created");
	}
}
class dog2 extends Animal2{
	dog2()
	{
		super();
		System.out.println("dog is created");
	}
}
public class demo2 {

	public static void main(String[] args) {
		dog2 d2= new dog2();
		
	}

}
