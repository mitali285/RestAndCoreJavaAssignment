/**
 * 
 */
package occuranceCountOfString;

/**
 * @author Mitali
 *
 */
public class OccuranceOfCharInstring {
	public String occuranceOfCharInstring(){

	String someString = "MitaliMitali";
	long count = someString.chars().filter(ch -> ch == 'M').count();
	System.out.println(count);
	
	long count2 = someString.chars().filter(ch -> ch == 'i').count();
	System.out.println(count2);
	
	long count3 = someString.chars().filter(ch -> ch == 't').count();
	System.out.println(count3);
	
	long count4 = someString.chars().filter(ch -> ch == 'a').count();
	System.out.println(count4);
	
	long count5 = someString.chars().filter(ch -> ch == 'l').count();
	System.out.println(count5);
	return someString;

}
}
