package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_prgm {

	public static void main(String[] args) {

		Vector v= new Vector();
		v.add(10);
		v.add("jyothi");
		v.add(34.3);
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			
		}
	}

}
