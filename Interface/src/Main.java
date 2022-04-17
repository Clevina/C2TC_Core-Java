interface Bike
{
	void getMileage();
}
class R15 implements Bike{

	@Override
	public void getMileage() {
		System.out.println("Mileage is 40km/l");
	}
	
}
public class Main {

	public static void main(String[] args) {
		//Bike b = new R15();
		R15 bike= new R15();
		bike.getMileage();

	}

}
