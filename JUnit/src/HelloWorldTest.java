import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class HelloWorldTest implements TestLifecycleLogger {
	
	@Test
	@RepeatedTest(10)
	void test1()
	{
		System.out.println("First test case");
	}

}
