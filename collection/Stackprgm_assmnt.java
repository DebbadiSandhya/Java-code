package collection;

import java.util.Stack;

public class Stackprgm_assmnt {
	
	public static void main(String[] args) {
	
		Stack s=new Stack<String>();
		s.add("king");
		s.add("queen");
		s.add("ram");
		
		s.push("roar");
		System.out.println(s);
		
		s.peek();
		System.out.println(s);
		
		Stack s1=new Stack<String>();
           s1.add("sam");
           s1.add("dam");
		   s1.pop();
		System.out.println(s1);

		
		
	}

}
