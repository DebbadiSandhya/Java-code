package daily;

import java.util.Scanner;

public class Area_circle {

	public static void main(String[] args) {
   
		Scanner s1=new Scanner(System.in);
		double pi=3.14;
		System.out.println("enter the value of r");
        int r=s1.nextInt();
        double area=pi*r*r;
       System.out.println("area of a circle " +area);
       
       System.out.println("enter the value of a");
       double a=s1.nextDouble();
       double area1=a*a;
       System.out.println("area of square " +area1);
       
       System.out.println("enter the value of l");
       double l=s1.nextDouble();
       System.out.println("enter the value of w");
       double w=s1.nextDouble();
       double area2=l*w;
       System.out.println("area of rectagle " +area2);
       
       System.out.println("enter the value of height");
       double height=s1.nextDouble();
       System.out.println("enter the value of base");
       double base=s1.nextDouble();
       double area3=height*base/2;
       System.out.println("area of triangle " +area3);

       System.out.println("enter the value of a1");
       double a1=s1.nextDouble();
       System.out.println("enter the value of b1");
       double b1=s1.nextDouble();
       System.out.println("enter the value of h");
       double h=s1.nextDouble();
       double area4=1/2*(a1+b1)*h;
       System.out.println("area of trepizeium " +area4);
       
        
		
	}

}
