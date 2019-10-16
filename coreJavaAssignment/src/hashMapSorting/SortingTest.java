/**
 * 
 */
package hashMapSorting;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @author Mitali
 *
 */
public class SortingTest {
	Sorting sorting = new Sorting();

	@Test
	public void shouldReturnSortedMap() {
		Map<String, String> map = new HashMap<>();
		map.put("A", "Mitali");
		map.put("B", "Ajay");
		map.put("C", "Rupesh");
		map.put("D", "Vishal");

		Map<String, String> expected = new LinkedHashMap<>();
		expected.put("B", "Ajay");
		expected.put("A", "Mitali");
		expected.put("C", "Rupesh");
		expected.put("D", "Vishal");

		Map<String, String> actual = sorting.getSortedMap(map);
		assertEquals(expected.toString(), actual.toString());
	}
}
