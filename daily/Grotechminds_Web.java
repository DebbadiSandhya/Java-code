package daily;
interface Google_Auth //achieve 100% abstraction
{
	void login();//Abstract Methods
	void logout();//Abstract Methods
}
public class Grotechminds_Web implements Google_Auth
{
	public static void main(String[] args) 
	{
		Grotechminds_Web ref=new Grotechminds_Web();
		ref.login();
		ref.logout();
		
	}

	public void login()
	{
		System.out.println("a");
	}

	public void logout()
	{
		System.out.println("b");

	}

}
