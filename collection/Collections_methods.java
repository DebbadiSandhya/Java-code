package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_methods {

	public static void main(String[] args) {

		ArrayList b=new ArrayList();
		b.add("sun");
		b.add("mon");
		b.add(34.5);
		b.addAll(b);
		b.add("sandy");
		System.out.println(b);
		b.add(3, "king");
		System.out.println(b);
		System.out.println(b.contains(34.5));
		System.out.println(b.size());
		System.out.println(b.isEmpty());

		//Collections.sort(b);
		//System.out.println(b);

	}

}
