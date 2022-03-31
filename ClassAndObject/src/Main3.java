class employee2{
	int id;
	String name;
	float salary;

	employee2()
	{
		System.out.println("user defined no-argument"+"constructor-executed");
	}
	employee2(int i,String n,float d){
		id=i;
		name=n;
		salary=d;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}
}
public class Main3 {

	public static void main(String[] args) {
		employee2 e1=new employee2(10,"xyz",200.0f);//user defined constructor with parameter
		employee2 e2=new employee2();
		e1.display();
		e2.display();

	}

}
