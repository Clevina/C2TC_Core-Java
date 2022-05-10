interface drawable1
{
	public void draw(int width, int length);
}
public class Variable1 {

	public static void main(String[] args) {
		drawable1 d1= (int width, int length) ->
		{
			System.out.println("Draw a cube with width and length of:"+width+","+length);
		};
		d1.draw(10, 20);

	}

}
