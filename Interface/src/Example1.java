interface Bank{
	float RateOfInterest();
}
class SBI implements Bank{

	@Override
	public float RateOfInterest() {
		return 9.15f;
	}
	
}
class HDFC implements Bank{

	@Override
	public float RateOfInterest() {
		
		return 9.7f;
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		Bank b = new SBI();
		Bank b1= new HDFC();
		System.out.println("Rate of interest in HDFC IS :"+b1.RateOfInterest());
		System.out.println("Rate of interest in SBI IS :"+b.RateOfInterest());
	}

}
