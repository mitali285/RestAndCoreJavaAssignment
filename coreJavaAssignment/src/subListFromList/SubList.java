/**
 * 
 */
package subListFromList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mitali
 *
 */
public class SubList {
	public List<Integer> subListFromArrayList(int i, int j)
	{
		
	
	
	List<Integer>list=new ArrayList<>();
	list.add(2);
	list.add(4);
	list.add(3);
	list.add(12);
	List<Integer> list1 = list.subList(i, j);
	System.out.println("Sub List: "+list1);
	return list1;
	}
}
	
	
	


