/**
 * 
 */
package wrongNumber;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author Mitali
 *
 */
public class TestWrongNumber {
	WrongNumberFinding wrongNumberFinding=new WrongNumberFinding();
	@Test
	public void TestWrongNumber()
	{
		//List<Integer>list=Arrays.asList(3,12,8,19,13,32,18,42,23,52);
		int actual=wrongNumberFinding.findingWrongNumber(Arrays.asList(3,12,8,19,13,32,18,42,18,42,23,52));
		assertNotEquals(16, actual);
	}
	
	@Test
	public void TestWrongNumberequals()
	{
		List<Integer>list=Arrays.asList(3,12,8,19,13,32,18,42,18,42,23,52);
		int actual=wrongNumberFinding.findingWrongNumber(list);
		assertEquals(19, actual);
	}

}
