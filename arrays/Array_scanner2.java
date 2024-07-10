package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_scanner2 {

	public static void main(String[] args) {

		double rollno[]=new double[3];
		Scanner s1=new Scanner(System.in);
		for (int i=0; i<3;i++)
		{
			System.out.println("enter the value of index-->" +i);
            rollno[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
	}
	}


