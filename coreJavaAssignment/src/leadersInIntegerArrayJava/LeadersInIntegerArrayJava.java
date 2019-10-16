/**
 * 
 */
package leadersInIntegerArrayJava;

/**
 * @author Mitali
 *
 */
public class LeadersInIntegerArrayJava {
	public int[] leaderInJava(int[] arr) {

		
		int count = 0;
		int[] result = new int[arr.length];
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			int j;
			for (j = i + 1; j < size; j++) {
				if (arr[i] <= arr[j])
					break;
			}
			if (j == size)
				result[count++] = arr[i];
		}
		return result;

	}

}
