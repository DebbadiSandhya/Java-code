package daily;

import java.util.Scanner;

public class Circumference_circle {

	public static void main(String[] args) {

		Scanner s1=new Scanner(System.in);
		double pi=3.14;
		System.out.println("enter the value of r");
        double r=s1.nextDouble();
        double circumference=2*pi*r;
       System.out.println("circumference of a circle " +circumference);

       System.out.println("enter the value of a");
       double a=s1.nextDouble();
       double circumference1=4*a;
      System.out.println("circumference of a square " +circumference1);
      
      System.out.println("enter the value of length");
      double length=s1.nextDouble();
      System.out.println("enter the value of width");
      double width=s1.nextDouble();
      double circumference2=2*length+2*width;
     System.out.println("circumference of a rectangle " +circumference2);
       
     System.out.println("enter the value of x");
     double x=s1.nextDouble();
     System.out.println("enter the value of y");
     double y=s1.nextDouble();
     System.out.println("enter the value of z");
     double z=s1.nextDouble();
     double circumference3=x+y+z;
    System.out.println("circumference of a triangle " +circumference3);
       
    System.out.println("enter the value of k");
    double k=s1.nextDouble();
    System.out.println("enter the value of l");
    double l=s1.nextDouble();
    System.out.println("enter the value of m");
    double m=s1.nextDouble();
    System.out.println("enter the value of n");
    double n=s1.nextDouble();
    double circumference4=(k*l)+(l*m)+(m*n)+(k*n);
   System.out.println("circumference of a trepezium " +circumference4);
	}

}
