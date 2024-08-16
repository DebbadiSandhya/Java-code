package daily;

public class Parameterized_static {
	
	static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	static void sub(double a, int b)
	{
		System.out.println(a-b);
	}
	static void mul(double a, int b)
	{
		System.out.println(a*b);
	}
	static void ch(char a)
	{
		System.out.println("Hello");
	}
	static void add(int a, int b, String c)
	{
		System.out.println("hi");
	
	}
	static void Bool(boolean b)
	{
		System.out.println("true");
	}
	
	public static void main(String[] args) {

		
		add(10,20);
		sub(12.3,3);
		mul(3535.432,6);
		ch('M');
		add(45,34,"sandy");
		Bool(true);
		
		
	}

}
