/**
 * 
 */
package leadersInIntegerArrayJava;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Mitali
 *
 */
public class TestLeadersInIntegerArrayJava {
	LeadersInIntegerArrayJava leaderInJava = new LeadersInIntegerArrayJava();

	@Test
	public void checkLeader() {
		int arr[] = {  14, 23, 15, 0, 9 };
		int[] actual = leaderInJava.leaderInJava(arr);
		int[] expected = { 23, 15, 9, 0, 0 };
		assertArrayEquals(expected, actual);
	}

}
