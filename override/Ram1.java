package override;

class Raj{
	
	void logout()  //it has been suppressed or overridden// we can use super keyword.
	{
		System.out.println("end1");
	}
}
public class Ram1 extends Raj{
	
	void logout() {
		
		System.out.println("end2");
	}

	public static void main(String[] args) {

		Ram1 x=new Ram1();
		x.logout();
	}

}
