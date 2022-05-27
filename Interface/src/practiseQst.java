interface Bike9
{
	void getMileage();
}

class R1511 implements Bike9
{

	@Override
	public  void getMileage() {
		System.out.println("Mileage is 40km/L");
		
	}
	
}
public class practiseQst {

	public static void main(String[] args) {
	 R1511 Bike9= new R1511();
	 Bike9.getMileage();
	}

}
