package daily;

class State_class
{
	State_class(int a){
		
		System.out.println("state class constructer");		
	}
}

public class Super_call extends State_class{
	Super_call()
	{
		super(343);
		System.out.println("super call constructer");		

	}

	public static void main(String[] args) {

		new Super_call();
		
	}

}
