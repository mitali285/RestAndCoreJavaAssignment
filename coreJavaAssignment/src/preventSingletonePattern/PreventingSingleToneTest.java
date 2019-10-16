package preventSingletonePattern;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class PreventingSingleToneTest {

	@Test
	public void singletonPatternTest() {
		PreventingSingleTone obj1 = PreventingSingleTone.getInstance() ;
		PreventingSingleTone obj2 = PreventingSingleTone.getInstance() ;

		assertEquals(obj1, obj2);
	}

	@Test
	public void serializationSingletonPatternTest() throws IOException, ClassNotFoundException {
		PreventingSingleTone instance1 = PreventingSingleTone.getInstance() ;
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
		out.writeObject(instance1);
		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
		PreventingSingleTone instance2 = (PreventingSingleTone) in.readObject();
		in.close();

		assertEquals(instance1, instance2);
	}
}
