package daily;

 class child 
{
	static void laptop()
	{
		System.out.println("child have laptop");
	}
	
    static void bike()
    {
		System.out.println("child have bike");

    }
}

public class Single_level_inherit extends child
{

	public static void main(String[] args) {

		house();
		car();
		laptop();
		bike();
	}
	
		static void house()
		{
			System.out.println("Father have house");
	
		}
		static void car()
		{
			System.out.println("father have car");
		}
		

}
