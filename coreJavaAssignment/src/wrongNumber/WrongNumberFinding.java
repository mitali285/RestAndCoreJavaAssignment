/**
 * 
 */
package wrongNumber;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mitali
 *
 */
public class WrongNumberFinding {

	public int findingWrongNumber(List<Integer> list) {
		int number = 0;
		for (int i = 0; i < list.size() - 2; i++) {

			if (i % 2 == 0) {
				if ((list.get(i + 2) - list.get(i)) != 5) {
					number = list.get(i + 2);
					break;
				}
			} else {
				if ((list.get(i + 2) - list.get(i)) != 10) {
					number = list.get(i + 2);
					break;
				}
			}
		}
		return number;

	}

	public static void main(String[] args) {
		WrongNumberFinding wc = new WrongNumberFinding();
		System.out.println(wc.findingWrongNumber(Arrays.asList(3, 12, 8, 19, 13, 32, 18, 42, 23, 52)));
	}
}
