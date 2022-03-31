class employee{
	int id;
	String name;
	float salary;
 employee()
 {
	System.out.println("user defined no-argument"+"constructor-executed");
	}
 void display() {
	 System.out.println(id+" "+name+ " " +salary);
 }
}
public class Main2 {

	public static void main(String[] args) {
		employee e1= new employee();// user defined without argument
		employee e2= new employee();// user defined without argument
		e1.display();
		e2.display();
	}

}
