/**
 * 
 */
package vowels;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Mitali
 *
 */
public class TestVowelsCount {
	VowelsCount vc=new VowelsCount();
	@Test
	public void count_vowels_in_string_guava() {

	    //String phrase = "whiskey tango fox";

	    int vowelCount = vc.count_Vowels("includehelp");
	    System.out.println(vowelCount);

	    assertEquals(4, vowelCount);
	}

}
