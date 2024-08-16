package daily;

class Alphabet_Auth
{
	 void auth1()
	{
		System.out.println("1");
	}
}
 class Amz_Google_auth extends Alphabet_Auth
{
	void auth2()
	{
		System.out.println("2");
	}
}
public class Multilevel_inherit extends Amz_Google_auth {
	
	void auth3()
	{
		System.out.println("3");
	}
	public static void main(String[] args) {

		Multilevel_inherit a1=new Multilevel_inherit();
		a1.auth3();
		a1.auth1();  //for static methods we can directly call no need to
		                 // create an object
		a1.auth2();
		
		
	}

}
