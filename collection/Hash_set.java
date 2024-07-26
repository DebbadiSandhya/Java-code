package collection;

import java.util.Collections;
import java.util.HashSet;

public class Hash_set {

	public static void main(String[] args) {

		HashSet h1=new HashSet();
		h1.add(34532);
		h1.add("ram");
		h1.add("sita");
		h1.add(null);
		h1.add(null);
		h1.add("ram");
		h1.add(34532);
		h1.add("ram");
		h1.add("sita");
		h1.add(null);
		h1.add(null);
		h1.add("ram");
		//Collections.sort(h1);

		System.out.println(h1);
		System.out.println(h1.size());
		


	}

}
