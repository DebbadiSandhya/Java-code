package daily;

public class Constructor_overloading {

	Constructor_overloading()
	{
		System.out.println("login to amazon");
		
	}
	Constructor_overloading(int a)
	{
		System.out.println("logout from amazon");
		
	}
	Constructor_overloading(String name)
	{
		System.out.println("order from amazon");

	}
	  
	public static void main(String[] args) {

     Constructor_overloading x=new Constructor_overloading(); //two ways to call a constructor this is 1st one//
		new Constructor_overloading(786);                         // this is 2nd one//
		new Constructor_overloading("daksh");
		
		
		
	}

}
