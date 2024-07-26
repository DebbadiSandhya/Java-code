package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays_prgm {

	public static void main(String[] args) {

		ArrayList a1=new ArrayList();
		a1.add(34.6);
		a1.add(11);	
		a1.add("Manish");
		System.out.println(a1);

		System.out.println(a1.addAll(a1));
		System.out.println(a1.remove(1));

		ArrayList a2=new ArrayList();
		a2.add(34);
		a2.add("sandy");
		a2.add(3535);
		System.out.println(a2);
		System.out.println(a2.removeAll(a2));


	      

	}
}
