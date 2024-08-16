package daily;

public class Global_variable {
	
	static double pi=3.14;  //global variable 
	
	static void sister()
	{
		int radius=10;
		double area_of_circle=pi*radius*radius;
		System.out.println(area_of_circle);
	}
	

	public static void main(String[] args) {

		int r=7;
		double area=pi*r*r;
		System.out.println(area);
		sister();
	}

}
