package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_arraylist {

	public static void main(String[] args) {

		ArrayList a1= new ArrayList();
		a1.add("ram");
		a1.add("sita");
		a1.add('v');
		a1.add(23);
		a1.add(32.3);
		System.out.println(a1);
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
