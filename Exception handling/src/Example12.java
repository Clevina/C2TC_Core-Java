
public class Example12 {

	public static void main(String[] args) {
		
		String[] s= {"Hello","423",null,"Hi"};
		for(int i=0;i<5;i++)
		{
			try
			{
			int a=s[i].length()+Integer.parseInt(s[i]);
			}
			catch(NumberFormatException|NullPointerException|ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("Handles above  mentioned three Exception");
			}
	}

}
}