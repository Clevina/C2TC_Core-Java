interface addition1
{
	public int add();
}
public class Example2 {

	public static void main(String[] args) {
		addition1 d1=()->(10+20);
		{
			System.out.println(d1.add());
		};

	}

}
