/**
 * 
 */
package hashMapSorting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Mitali
 *
 */
public class Sorting {
	Map<String, String> getSortedMap(Map<String, String> map) {

		Map<String, String> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println(sorted);
		return sorted;
	}
}