package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_boolean {

	public static void main(String[] args) {

		boolean rollno[]=new boolean[3];
		Scanner s1=new Scanner(System.in);
		for (int i=0; i<3;i++)
		{
			System.out.println("enter the value of index-->" +i);
            rollno[i]=s1.nextBoolean();
		}
		System.out.println(Arrays.toString(rollno));
	}
	}


