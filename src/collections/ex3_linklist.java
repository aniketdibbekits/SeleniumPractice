package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ex3_linklist {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add("Aniket");
		li.add("Rachi");
		li.remove(1);
		
		
		ListIterator lit = li.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
	}

}
