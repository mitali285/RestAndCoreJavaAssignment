/**
 * 
 */
package minMaxNumber;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mitali
 *
 */
public class TestFindingMinMaxNumberFromArray {
	int i[] = { 2, 4, 3, 5, 1 };
	FindingMinMaxNumberFromArray findingMinMaxNumberFromArray = new FindingMinMaxNumberFromArray();

	@Test
	public void TestMaxNumber() {
		int result = findingMinMaxNumberFromArray.getMaxValue(i);
		assertEquals(5, result);
	}
	
	@Test
	public void TestMinNumber() {
		int result = findingMinMaxNumberFromArray.getMinValue(i);
		assertEquals(1, result);
	}
}
