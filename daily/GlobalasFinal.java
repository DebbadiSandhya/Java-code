package daily;

public class GlobalasFinal {
	
	final static double pi=3.14;
	     final static int r=15;

	static void area()
	{
    	//int r=10;//
		System.out.println(pi*r*r);
	}
	static void circumference()
	{
		//int r=100;//
        System.out.println(2*pi*r);
	}

	public static void main(String[] args) {

		area();
		circumference();
		
		
	}

}
