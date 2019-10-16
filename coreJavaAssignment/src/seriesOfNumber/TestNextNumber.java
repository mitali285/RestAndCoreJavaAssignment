/**
 * 
 */
package seriesOfNumber;







import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author Mitali
 *
 */
public class TestNextNumber {
	NextNumberInSeries nextNumberInSeries=new NextNumberInSeries();
	@Test
	public void nextNumberTest()
	{
		int actual = nextNumberInSeries.seriesOfNumber();
	    Assert.assertEquals(10,actual);
	}

}
