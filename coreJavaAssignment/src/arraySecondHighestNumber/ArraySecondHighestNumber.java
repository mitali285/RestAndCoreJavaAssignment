/**
 * 
 */
package arraySecondHighestNumber;

/**
 * @author Mitali
 *
 */
public class ArraySecondHighestNumber {
	public int findsecondHighestNumber()
	{

		int array[] = { 2, 4, 5, 3, 9 };
		int temp;
		int size;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}

		}
		System.out.println(" Second Highest Number is " + array[array.length - 2]);
		
		return array[array.length - 2];
	}

}
