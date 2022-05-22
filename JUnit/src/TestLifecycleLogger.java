import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
 @TestInstance(Lifecycle.PER_CLASS)
 interface TestLifecycleLogger {
	@BeforeAll
	default void beforeAllTests()
	{
		System.out.println("Before all tsts");
	}
	@AfterAll
	default void aftereAllTests()
	{
		System.out.println("After all tsts");
	}
	@Test
	default void testMethod()
	{
		System.out.println("this is test method...");
	}

}