/**
 * 
 */
package twoTone;

/**
 * @author Mitali
 *
 */
public class TwoToneClass {

	public static TwoToneClass object;
	public static int objectcount = 0;

	private TwoToneClass() {
		objectcount++;
	}

	public static TwoToneClass getInstance()
	{
		if(objectcount<3)
		{
			objectcount++;
			object=new TwoToneClass();
		}
		return object;
	}

	public static void main(String[] args) {
		
		TwoToneClass twoToneClass = TwoToneClass.getInstance();

		TwoToneClass twoToneClass11 = TwoToneClass.getInstance();
		TwoToneClass twoToneClass22 = new TwoToneClass().getInstance();
		System.out.println(twoToneClass.hashCode());
		System.out.println(twoToneClass11.hashCode());
		System.out.println(twoToneClass22.hashCode());

	}
}
