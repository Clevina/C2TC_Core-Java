interface Vehicle{
	 void Engine();
	
	
}
interface Bike1 extends Vehicle{
	void getMileage();
}
class Car implements Bike1{

	@Override
	public void Engine() {
		System.out.println("Liquide-cooled SOHC 4-valve fuel-injected engine");
	}

	@Override
	public void getMileage() {
		System.out.println("Mileage is 40km/l");
	
}
}
public class Example2 {

	public static void main(String[] args) {
		Car c= new Car();
		c.Engine();
		c.getMileage();
	}
}

