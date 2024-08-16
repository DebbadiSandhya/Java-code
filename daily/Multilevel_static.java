package daily;

class Alpha1
{
	static void xy()
	{
		System.out.println("1");
	}
}
 class Alpha2 extends Alpha1
{
	static void ab()
	{
		System.out.println("2");
	}
}
public class Multilevel_static extends Alpha2 {

	public static void main(String[] args) {

		xy();
		ab();
	}

}
