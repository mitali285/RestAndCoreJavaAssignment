/**
 * 
 */
package twoTone;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * @author Mitali
 *
 */
public class TestTwoToneClass {
	@Test
	public void TestTwoToneClas()
	{
		//TwoToneClass objectcount=new TwoToneClass();
		TwoToneClass objectcount=TwoToneClass.getInstance();
		
		//TwoToneClass objectcount1=new TwoToneClass();
		TwoToneClass objectcount2=TwoToneClass.getInstance();
		
		//TwoToneClass objectcount2=new TwoToneClass();
		TwoToneClass objectcount3=TwoToneClass.getInstance();
		
		assertThat(objectcount2.hashCode(), anyOf(is(objectcount.hashCode()),is(objectcount3.hashCode())));
		
	}
}
