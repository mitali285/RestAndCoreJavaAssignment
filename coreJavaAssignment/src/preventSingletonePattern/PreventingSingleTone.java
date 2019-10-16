package preventSingletonePattern;

import java.io.Serializable;

public class PreventingSingleTone implements Serializable {

	private static final long serialVersionUID = 1L;
	
	 

	private static PreventingSingleTone instance;

	private PreventingSingleTone() {
		// private constructor
	}

	public static PreventingSingleTone getInstance() {
		if (instance == null) {
			// synchronized block to remove overhead
			synchronized (PreventingSingleTone.class) {
				if (instance == null) {
					// if instance is null, initialize
					instance = new PreventingSingleTone();
				}

			}
		}
		return instance;
	}
	protected Object readResolve() {
		 return instance;
		
		 }
		
}
