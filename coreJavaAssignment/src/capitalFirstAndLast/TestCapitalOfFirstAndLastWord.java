/**
 * 
 */
package capitalFirstAndLast;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mitali
 *
 */
public class TestCapitalOfFirstAndLastWord {
	CapitalOfFirstAndLastWord capital = new CapitalOfFirstAndLastWord();

	@Test
	public void CapitalOfFirstAndLastWord() {
		String str = capital.firstAndLastWordCapital("yash pune office");
		System.out.println(str);
		Assert.assertEquals("YasH PunE OfficE", str);

	}

}
