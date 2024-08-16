package daily;

public class Globa2_variable {
	
	int  no_of_days=365;   //global variable

	public static void main(String[] args) {
		Globa2_variable g1= new Globa2_variable();
		System.out.println(g1.no_of_days);
		g1.no_of_days=366;
		System.out.println(g1.no_of_days);

		
	}

}
