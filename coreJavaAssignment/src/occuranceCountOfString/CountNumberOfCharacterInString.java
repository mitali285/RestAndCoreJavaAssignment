/**
 * 
 */
package occuranceCountOfString;

import java.util.Scanner;

/**
 * @author Mitali
 *
 */
public class CountNumberOfCharacterInString {
	public String countNumberOfChar(){

	    String s ="iamyashemployee";
	    String result="";
	    StringBuilder sb = new StringBuilder(s);


	    while(sb.length() != 0){
	        int count = 0;
	        char character = sb.charAt(0);
	        while(sb.indexOf(character+"") != -1){
	            sb.deleteCharAt(sb.indexOf(character+""));
	            count++;
	        }
	       if(count>1)
	        result=result+character+count;
	       else
	    	   result=result+character;
	    }
	    System.out.println(result);
		return result;         
	}


}

