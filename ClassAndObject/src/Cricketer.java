
public class Cricketer {

	String name="Dhoni";
	int age=39;
	String color="Brown";
	String role="Batsman";
	String nationality="Indian";
	void display() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("color:"+age);
		System.out.println("role:"+role);
		System.out.println("nationality:"+nationality);
		System.out.println("I LOVE CRICKET");
	}

	public static void main(String[] args) {
	System.out.println("Main method started");
	Cricketer c= new Cricketer();
	c.display();
	System.out.println("Main method ended");

	}

}
