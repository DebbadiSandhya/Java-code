package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep_scanner {

	public static void main(String[] args) {

		Scanner s1=new Scanner(System.in);
		try {
			System.out.println("enter your mobile number");
			double a=s1.nextDouble();
			System.out.println(a);

		}
		catch(InputMismatchException a1) {
			System.out.println("please enter mobile no");
			Scanner s2=new Scanner(System.in);
			try {
				double b=s2.nextDouble();
				System.out.println("please enter mobile no");
                System.out.println(b);
			}
			catch(InputMismatchException a2) {
				System.out.println("please enter mobile no");
				Scanner s3= new Scanner(System.in);
				double c=s3.nextDouble();
				System.out.println(c);
			}
		}
		finally
		{
			System.out.println("entered mobile no successfully");
		}

		}
		
	
	}


