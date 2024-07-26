package exception_handling;

public class Throw_Throws {  //throw-throw an exception, throws-declare an exception//

	public static void main(String[] args){

		String name[]=new String[2];
		name[0]="Ram";
		name[1]="sam";
		try {
		name[2]="mam";
		System.out.println("exception caught");
		}
		catch(ArrayIndexOutOfBoundsException a1) {
			System.out.println("exception handled");
		}
		finally {
			System.out.println("any this block will excute");
		}
		}
		
	
	}


