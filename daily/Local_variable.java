package daily;

public class Local_variable {
	
	static void add()
	{
		int a=100;  //local variable scope is in this method only
		System.out.println(a);
	}

	void subtract()
	{
		int b=300;      //local variable scope is in this method only
		System.out.println(b);
	}
	public static void main(String[] args) {

		int c=300;       //local variable scope is in this method only
		System.out.println(c);
		add();
		
	}

}
