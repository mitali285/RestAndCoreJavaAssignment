/**
 * 
 */
package arraySecondHighestNumber;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mitali
 *
 */
public class SortedByJAva8 {
	public int secondHighestNumber(List<Integer> list) {
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		return sortedList.get(sortedList.size() - 2);
	}

}
