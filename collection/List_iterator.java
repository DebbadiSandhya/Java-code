package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_iterator {

	public static void main(String[] args) {

		ArrayList l1=new ArrayList();
		l1.add("ram");
		l1.add("sita");
		l1.add('v');
		l1.add(23);
		l1.add(32.3);
		System.out.println(l1);
		ListIterator i2=l1.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
				

			}

}
