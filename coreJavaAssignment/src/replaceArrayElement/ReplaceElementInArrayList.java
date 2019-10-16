package replaceArrayElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Mitali
 *
 */
public class ReplaceElementInArrayList {
	
	public List<Integer> checkArrayList(int a,int b) {
		
	
  
	
	ArrayList<Integer>list=new ArrayList<>();
	list.add(4);
	list.add(5);
	list.add(10);
	System.out.println("Before Replacing element"+list);
	list.set(1, 11);
	System.out.println("After Replacing element"+list);
	return list;
	
	
	
	}

}
