package daily;

public class MethodOverloading_ex {

	static void add()
	{
		System.out.println("1");
		
	}
	static void add(int a, double b)
	{
		System.out.println("2");
	}
	static void add(char a, char b)
	{
		System.out.println("3");
		
	}
	static void add(double a, boolean b)
	{
		System.out.println("4");
	}
	
	void add(int a, int b, int c)   // non static method so need to create an object and call//
	{
		System.out.println("5");
	}
	
	public static void main(String[] args) {
      
		add();
		add(4, 2.5);
		add('m', 'n');
		add(6.74, true);
		MethodOverloading_ex ref= new MethodOverloading_ex();
		 ref.add(6, 54, 789);
			
		
	}

}
