class Animal1{
	void eat() { //invoking parent class method
		System.out.println("Animal is created");
	}
	
}
class dog1 extends Animal1
{
	void eat()
	{
		System.out.println("Eating bread");
	}
	void bark()
	{
		
		System.out.println("barking");
	}
	void work()
	{
		super.eat();//invoking parent class method
		System.out.println("Working");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		dog1 d1= new dog1();
		d1.bark();
		d1.eat();
		d1.work();
		
	}

}
