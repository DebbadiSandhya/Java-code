package exception_handling;

import java.util.Scanner;

public class Handle_scanner {

	public static void main(String[] args) {
		
		String name[]=new String[2];
		name[0]="mom";
		name[1]="dad";
		try {
		 	//name[2]="sis";
			Scanner s1=new Scanner(System.in);

			System.out.println("enter index value of [2]");
			//String name2[]=s1.next();
			//System.out.println(name2[]);

			
		}
		catch(ArrayIndexOutOfBoundsException a) {
			
		}
	}

}
