/**
 * 
 */
package spy;

/**
 * @author Mitali
 *
 */
public class SpyNumber {
	public boolean checkSpyNumber(int n)
	{
		 
				 int product=1;
				 int sum=0;
		int ld;
				
				while(n>0)
				{
					ld=n%10;
					sum=sum+ld;
					product=product*ld;
					n=n/10;
		    
	}
				if(sum==product)
				
					return true;
				
			
				
				return false;
			
	}
}
