interface writable{
	void writes();
}
interface readable{
	void reads();
}
class Main3 implements writable,readable{

	@Override
	public void reads() {
	System.out.println("Students reads....!");
		
	}

	@Override
	public void writes() {
		System.out.println("Student Writes.....!");
		
	}
	
}
public class Example7 {

	public static void main(String[] args) {
		Main3 m3= new Main3();
		m3.reads();
		m3.writes();
	}

}
