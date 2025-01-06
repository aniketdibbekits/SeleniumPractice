package collections;

import java.util.HashSet;
import java.util.Iterator;

public class es4_hashset {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Aniket");
		hs.add("Aniket");
		for(int i=0;i<hs.size();i++) {
			System.out.println(hs.get(i));
		}
		
//		Iterator itr = new Iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
	}

}
