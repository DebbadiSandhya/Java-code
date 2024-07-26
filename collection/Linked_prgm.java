package collection;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_prgm {

	public static void main(String[] args) {

		LinkedList b=new LinkedList();
		
		b.add("null");
		b.add("null"); 
		b.add("sun");
		b.add("sun");
		b.add("null");
		b.add("null"); 
		b.add("sun");
		b.add("sun");
		b.add("null");
		b.add("null"); 
		b.add("sun");
		b.add("sun");
		b.add("null");
		b.add("null"); 
		b.add("sun");
		b.add("sun");
		b.add(3, "king");
		System.out.println(b);
		Collections.sort(b);
		System.out.println(b);

//yes,same type of data should be present either string or integer.then only sorting is possible
				
	}

}
