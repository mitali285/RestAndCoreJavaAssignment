/**
 * 
 */
package sumofelementInArrayWithEvenNumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Mitali
 *
 */
public class TestSumOfEvenNumber {
	SumOfEvenNumber SumOfEvenNumber=new SumOfEvenNumber();
	@Test
	public void TestSumofNumber()
	{
		int actual=SumOfEvenNumber.sumOfEvenNumber();
		assertEquals(12, actual);
		
	}
	

}
