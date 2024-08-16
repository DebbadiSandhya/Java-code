
package daily;

import java.util.Scanner;

public class Scanner_ex {
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=s1.nextInt();
        System.out.println("enter the value of b");
        int b=s1.nextInt();
        int sum=a+b;
        System.out.println("addition is " +sum);
        
        //System.out.println("subtract is " +sub);


		
        //String name= s1.next();   //these all are scanner classes//
        //int age= s1.nextInt();
        //byte b1=s1.nextByte();
        System.out.println("value of c");
        byte c=s1.nextByte();
        System.out.println("value of d");
        byte d=s1.nextByte();
        int sub=c-d;
        System.out.println(sub);

        //short s2=s1.nextShort();
        System.out.println("value of e");
        short e=s1.nextShort();
        System.out.println("value of f");
        short f=s1.nextShort();
        int mul=e*f;
        System.out.println(mul);

        //long s3=s1.nextLong();
        System.out.println("value of g");
        long g=s1.nextLong();
        System.out.println("value of h");
        long h=s1.nextLong();
        long div=g*h;
        System.out.println(div);
        
        //float f1=s1.nextFloat();
        System.out.println("value of i");
        float i=s1.nextFloat();
        System.out.println("value of j");
        float j=s1.nextFloat();
        float add=i+j;
        System.out.println(add);
        
        //double d1= s1.nextDouble();
        System.out.println("value of k");
        double k=s1.nextDouble();
        System.out.println("value of l");
        double l=s1.nextDouble();
        double sub2=k-l;
        System.out.println(sub2);
        
        //boolean b2=s1.nextBoolean();
        System.out.println("value of m");
        boolean m=s1.nextBoolean();

        System.out.println(m);
        
		//nextline();
			}

}
