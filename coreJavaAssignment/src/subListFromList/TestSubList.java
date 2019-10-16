/**
 * 
 */
package subListFromList;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author Mitali
 *
 */
public class TestSubList {
	@Test
	public void TestSublist()
	{
	List<Integer> li=Arrays.asList(2,4,3,12);
	
	SubList su=new SubList();
	List<Integer> result=su.subListFromArrayList(1,3);
	assertEquals(li.subList(1, 3), result);
	
	}
	

}
