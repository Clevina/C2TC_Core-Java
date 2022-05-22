import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class AssertDemo1 {
	@Test
public void simple()
{
	int A=1;
	int B=1;
	assertEquals(A,B);
}
public void simple1()
{
	int A=1;
	int B=2;
	assertEquals(A,B);
}
public void simple2()
{
	int A=1;
	int B=3;
	assertEquals(A,B);
}
}