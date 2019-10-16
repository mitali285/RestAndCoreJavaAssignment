/**
 * 
 */
package arraySecondHighestNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Mitali
 *
 */
public class TestArraySecondHighestNumber {
	//int array[]={3,2,4,5};
	ArraySecondHighestNumber arraySecondHighestNumber=new ArraySecondHighestNumber();
	@Test
	public void ArraySecondHighestNumberTest()
	{
		int secondHighestNumber=arraySecondHighestNumber.findsecondHighestNumber();
		assertEquals(5, secondHighestNumber);
	}
	

}
