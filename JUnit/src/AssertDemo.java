import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertDemo {
	@Disabled
	@Test
	public void simple()
	{
		int result=1;
		int expected=2;
		assertEquals(result,expected);
	}

}
