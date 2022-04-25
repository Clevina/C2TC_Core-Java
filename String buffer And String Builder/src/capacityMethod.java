
public class capacityMethod {

	public static void main(String[] args) {
	StringBuffer sb= new StringBuffer();
	System.out.println(sb.capacity());
	sb.append("Hello");
	System.out.println(sb.capacity());
	sb.append("java is my favorite language");
	System.out.println(sb.capacity());

	}

}
