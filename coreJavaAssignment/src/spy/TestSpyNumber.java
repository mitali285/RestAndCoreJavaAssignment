/**
 * 
 */
package spy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Mitali
 *
 */
public class TestSpyNumber {
	SpyNumber sp=new SpyNumber();
	
	@Test
	public void TestSpyNumberTrue() {
		boolean actual = sp.checkSpyNumber(1124);
		assertTrue(actual);
		}
	
	@Test
	public void TestSpyNumberFalse() {
		boolean actual3 = sp.checkSpyNumber(1123);
		assertFalse(actual3);
	}

	}

