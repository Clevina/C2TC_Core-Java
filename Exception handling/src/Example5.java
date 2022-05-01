import java.io.FileInputStream;

public class Example5 {
	public void checkFileNotFound()
	{
		
	try
	{
		FileInputStream in = new FileInputStream("input.txt");
		System.out.println("This is not printed");
	}
	catch(Exception fileNotFoundException)
		{
			System.out.println(fileNotFoundException+"file not found exception");
		}
	}
	public static void main(String[] args) {
		Example5 exp=new Example5();
		exp.checkFileNotFound();
	}
		
		
	}


