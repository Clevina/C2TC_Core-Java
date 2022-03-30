class Apple{
	int weight;
}
public class Main {

	public static void main(String[] args) {
		Apple a1=new Apple();
		Apple a2= new Apple();
		a1.weight=20;
		a2.weight=30;
		//a2=a1;
		System.out.println(a1.weight);
		System.out.println(a2.weight);
	}

}
