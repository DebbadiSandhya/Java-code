package daily;

public class Area_circumference {
	
	static void Area() {
		double pi=3.14;
		int r=12;
		double area=pi*r*r;
		System.out.println(area);
		
	}
	static void circumference()
	{
		double pi=3.14;
		int r=30;
		double circum=2*pi*r;
		System.out.println(circum);
	}

	public static void main(String[] args) {

		Area();
		circumference();
	}

}
