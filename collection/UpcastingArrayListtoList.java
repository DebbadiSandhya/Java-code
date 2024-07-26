
//converting ArrayList to list and Linked Hash set to set//

package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UpcastingArrayListtoList {

	public static void main(String[] args) {

		System.out.println("understanding list");
		List l1=new ArrayList();//upcasting list
		l1.add("12");
		l1.add("flower");
	    l1.add('I');
	    l1.add("need");
	    l1.add(null);
	    l1.add(null);
	    l1.add(9.097);
	    System.out.println(l1);
	    
		System.out.println("understanding set");
		Set s1=new HashSet(); //upcasting for set
		s1.add("12");
		s1.add("flower");
	    s1.add('I');
	    s1.add("need");
	    s1.add(null);
	    s1.add(null);
	    s1.add(9.097);
	    System.out.println(s1);

	    }

}
