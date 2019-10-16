/**
 * 
 */
package anagram;

import java.util.Arrays;

/**
 * @author Mitali
 *
 */
public class AnagramOfString {
	public boolean anagramCheckForString() {
		String str1 = "keep";
		String str2 = "peek";

		if (str1.length() == str2.length()) {
			char[] arr1 = str1.toLowerCase().toCharArray();
			char[] arr2 = str2.toLowerCase().toCharArray();

			Arrays.sort(arr1);
			System.out.println(Arrays.toString(arr1));
			Arrays.sort(arr2);
			System.out.println(Arrays.toString(arr2));
			System.out.println(Arrays.equals(arr1, arr2));
			// boolean result=Arrays.equals(arr1, arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;// System.out.println("Given strings are anagrams");
			}

		}

		return false;

	}
}
