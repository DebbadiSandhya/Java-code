package daily;

class Car
{
	Car(){
	System.out.println("car constructor");
	}
}
public class Super_nonpara extends Car {
	Super_nonpara()
	{
		super();
		System.out.println("super non para constructor");

	}

	public static void main(String[] args) {

		new Super_nonpara();
		
	}

}
