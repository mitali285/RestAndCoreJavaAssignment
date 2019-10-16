/**
 * 
 */
package sumofelementInArrayWithEvenNumbers;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mitali
 *
 */
public class SumOfEvenNumber {
	public int sumOfEvenNumber()
	{
		
	
	List<Integer>list=Arrays.asList(2,4,5,6,7,9);
	int sumofeven=list.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
System.out.println(sumofeven);
return sumofeven;
}
}
