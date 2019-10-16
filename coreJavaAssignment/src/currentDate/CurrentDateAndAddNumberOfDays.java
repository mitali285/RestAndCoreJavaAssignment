/**
 * 
 */
package currentDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Mitali
 *
 */
public class CurrentDateAndAddNumberOfDays {
	public String getcurrentDate(int days)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, days);  
		
		String newDate = sdf.format(calendar.getTime());  
		System.out.println("Incremnted current date by one: "+newDate);
		return newDate;
	}

}

