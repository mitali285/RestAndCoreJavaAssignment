package replaceArrayElement;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;




public class TestReplaceElementInArrayList {
	List<Integer> list;
	ReplaceElementInArrayList replaceElementInArrayList   = new ReplaceElementInArrayList();
	
	@Before
	public void initialization() {
		list =  Arrays.asList(4, 5, 10);
	}
	
	@Test
	public void shouldCheckNumberIsPresentInArrayList() {
		replaceElementInArrayList .checkArrayList(5, 11);
		assertEquals(true, list.contains(5));
	}

	@Test
	public void shouldCheckNumberIsNotPresentInArrayList() {
		replaceElementInArrayList.checkArrayList(2, 11);
		assertEquals(false, list.contains(2));
	}
	@Test
	public void shouldReturnUpdatedArrayList() {
		List<Integer> actual = replaceElementInArrayList.checkArrayList(5,11 );
		List<Integer> expected = Arrays.asList(4, 11, 10);
		assertEquals(expected, actual);
	}


}
