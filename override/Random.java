package override;

 class Ram{
	
	void login() {   //method name same login()
		
		System.out.println("email id");
	}
}

public class Random extends Ram{
	
	void login() 
	{                //method name should be same in different classes
	super.login();   //super is a keyword used to call parent class//
	   System.out.println("mobile no");
	}


	public static void main(String[] args) {

		Random z=new Random();
		z.login(); //calling only parent class from parent class super keyword is used to call child class//
		
	}

}
