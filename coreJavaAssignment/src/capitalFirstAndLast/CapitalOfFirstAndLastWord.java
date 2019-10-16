/**
 * 
 */
package capitalFirstAndLast;

/**
 * @author Mitali
 *
 */
public class CapitalOfFirstAndLastWord {

	public String firstAndLastWordCapital(String strin) {

		String str = "";
		String s[] = strin.split(" ");
		// for(String e:s)
		for (int i = 0; i < s.length; i++) {
			String word = s[i];
			String result = word.substring(0, 1).toUpperCase() + word.substring(1, word.length() - 1)
					+ word.substring(word.length() - 1, word.length()).toUpperCase();
			str = str + result;
			if (i < s.length - 1)
				str = str + " ";
		}
		return str;

	}

}
