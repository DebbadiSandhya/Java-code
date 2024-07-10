package arrays;

import java.util.Arrays;

public class Copy_array {

	public static void main(String[] args) {

		int input[]=new int[3];
		input[0]=80;
		input[1]=54;
		input[2]=40;
		int output[]=new int[3];
		for(int i=0;i<=2;i++)
		{
			output[i]=input[i];
		}
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));

	}

}
