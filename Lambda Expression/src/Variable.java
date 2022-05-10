interface drawable
{
	public void draw(int radius);
}
public class Variable {

	public static void main(String[] args) {
		drawable d2=(int radius) ->
		{System.out.println("Draw a circle with radius of:"+radius);
			
		};
		d2.draw(10);

	}

}
