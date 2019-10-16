/**
 * 
 */
package minMaxNumber;

/**
 * @author Mitali
 *
 */
public class FindingMinMaxNumberFromArray {
	public int getMaxValue(int [] numbers)
	{ 
		int maxValue=numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i] > maxValue){
				  maxValue = numbers[i];
				}
			  }
			  return maxValue;
			}


	public int getMinValue(int [] numbers1)
	{
		int minValue=numbers1[0];
		for(int i=0;i<numbers1.length;i++)
		{
			if(numbers1[i]<minValue)
			{
				minValue=numbers1[i];
			}
		}
		return minValue;
	}
	
	
}
