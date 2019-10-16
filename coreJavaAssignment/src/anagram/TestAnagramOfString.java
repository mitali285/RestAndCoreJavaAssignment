/**
 * 
 */
package anagram;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Mitali
 *
 */
public class TestAnagramOfString {
	AnagramOfString  anagramOfString=new AnagramOfString();
	@Test
	public void TestAnagramOfStringTrue()
	{
		boolean actual=anagramOfString.anagramCheckForString();
		assertEquals(true, actual);
	}
	
	@Test
	public void TestAnagramOfStringFalse()
	{
		boolean actual=anagramOfString.anagramCheckForString();
		assertTrue(actual);
	}
	
	
	@Test
	public void TestAnagramOfStringNotEquals()
	{
		boolean actual=anagramOfString.anagramCheckForString();
		assertNotEquals(false, actual);
	}

}
