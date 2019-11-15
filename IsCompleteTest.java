import static org.junit.Assert.*;
import org.junit.Test;

public class IsCompleteTest 
{
	@Test
	public void TestForFalseValue()
	{
		Subtask s = new Subtask("Task 1");
		assertEquals("Testing for false value", false, s.isComplete());
	}
	
	@Test
	public void TestForTrueValue()
	{
		Subtask s = new Subtask("Task 2");
		s.setComplete(true);
		assertEquals("Testing for true value", true, s.isComplete());
	}
}
