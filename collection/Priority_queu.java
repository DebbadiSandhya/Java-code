package collection;

import java.util.PriorityQueue;

public class Priority_queu {

	public static void main(String[] args) {

		PriorityQueue p1=new PriorityQueue();
		p1.add("sandy");
		p1.add("sam");
		p1.add("mom");
		p1.add("mon");
		p1.add("mon");
		p1.add("sandy");
		p1.add("sam");
		p1.add("mom");
		p1.add("mon");
		p1.add("mon");
		//p1.add(56.4);  //not accepting integers
		//p1.add(null);
		//p1.add(null);
		System.out.println(p1);
		System.out.println(p1.size());

	}

}
