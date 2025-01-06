package collections;

import java.util.Enumeration;
import java.util.Vector;

public class ex2_vector {
	public static void main(String[] args) {
		Vector vc = new Vector();
		vc.add(100);
		vc.add("Aniket");
		vc.add(true);
//		System.out.println(vc.contains("Aniket"));
//		vc.remove(2);
//		vc.remove(0);
		for(int i=0;i<vc.size();i++) {
			System.out.println(vc.get(i));
		}
		
		Enumeration en = vc.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
	}
//	Enumerator:
//		Introduced in: Java 1 (before Java Collections Framework).
//		Why Use:
//		Legacy interface used mainly with older classes like Vector and Hashtable.
//		Read-Only: Allows reading elements but doesn't support modification.
//		Methods:
//		hasMoreElements() - Checks if more elements exist.
//		nextElement() - Retrieves the next element.

}
