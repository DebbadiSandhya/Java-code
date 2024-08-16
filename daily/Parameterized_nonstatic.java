package daily;

public class Parameterized_nonstatic {
	
	void add(int a,int b)  // non static method so need to create an object and call//
	{
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
  Parameterized_nonstatic ref= new Parameterized_nonstatic();
           ref.add(89, 79);
		
	}

}
