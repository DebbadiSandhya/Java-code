package collection;

import java.util.Collections;
//import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Linkedhash_set {

	public static void main(String[] args) {

		LinkedHashSet l1=new LinkedHashSet();
		l1.add(null);
		l1.add(232);
		l1.add("milk");
		l1.add("milk");
		l1.add("curd");
		System.out.println(l1);
		System.out.println(l1.size());

	}

}
