package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ex1_ArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add("Rachi");
		al.add(3,"Aniket");
//		System.out.println(al);
//		System.out.println(al.get(0));
//		System.out.println(al.indexOf("Amit"));
//		System.out.println(al.isEmpty());
		al.set(2, "Amit");
		al.remove(3);
//		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		Iterator itr = new Iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
//Iterator:
//Introduced in: Java 2 (Java Collections Framework).
//Why Use:
//Traversal: Provides a standard way to iterate over collections like ArrayList, HashSet, etc.
//Removal: Allows removing elements during iteration.
//Methods:
//hasNext() - Checks if there are more elements.
//next() - Retrieves the next element.
//remove() - Removes the current element (optional).
