package daily;

public class Nonparameterized_nonstatic {

	void add()
	{
		int a=29,b=30;
		int sum= a+b;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
        
		Nonparameterized_nonstatic x=new Nonparameterized_nonstatic();
		x.add();
		
		
	}

}
