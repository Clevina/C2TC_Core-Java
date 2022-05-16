
public interface Actor {
	 void act();
	 void speak();
	default void comedy()
	{
		System.out.println("I can make comedy");
	}
	

}

class Hero implements Actor
{
 public void comedy()
{
	System.out.println("I can make people laugh");
}
	@Override
	public void act() {
		System.out.println("I can act");
		
	}

	@Override
	public void speak() {
		System.out.println("I can speak");
		
	}
	
}
class Villain implements Actor
{
public void rude()
{
	System.out.println("I can be rude");
}
	@Override
	public void act() {
		System.out.println("I can act");
		
	}

	@Override
	public void speak() {
		System.out.println("I can speak");
		
	}
	

public static void main(String[]args)
{
	Actor a= new Villain();
	a.act();
}
}