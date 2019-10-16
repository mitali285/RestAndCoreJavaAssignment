/**
 * 
 */
package currentDate;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mitali
 *
 */
public class TestCurrentDateAnd {
	CurrentDateAndAddNumberOfDays currentDateAndAddNumberOfDays = new CurrentDateAndAddNumberOfDays();

	@Test
	public void TestCurrentDate() {
		String actual = currentDateAndAddNumberOfDays.getcurrentDate(5);
		Assert.assertEquals("15/10/19", actual);
	}

}
