/**
 * 
 */
package occuranceCountOfString;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Mitali
 *
 */
public class TestOccuranceOfChar {
	
	CountNumberOfCharacterInString countNumberOfCharacterInString=new CountNumberOfCharacterInString();
	@Test
	public void TestNumberOfCountInString()
	{
	String count=countNumberOfCharacterInString.countNumberOfChar();
	assertEquals("ia2m2y2she3plo", count);
	}
	

}
