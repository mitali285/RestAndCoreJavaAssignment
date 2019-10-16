/**
 * 
 */
package seriesOfNumber;

import java.util.List;

/**
 * @author Mitali
 *
 */
public class NextNumberInSeries {

	public int seriesOfNumber()
	{
		int i=0;	
			for( i=7;i<10;)//for-loop
			{
				
			  System.out.print(i + ",");
			  i+=3;
			  System.out.print(i + ",");
			  i-=2;
			 
			}
			
			return i;
		}
	
	public static void main(String[] args) {
		NextNumberInSeries inSeries=new NextNumberInSeries();
		System.out.println(inSeries.seriesOfNumber());
	}
	}

