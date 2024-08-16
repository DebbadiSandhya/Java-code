package daily;

public class Logical_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age= 18;
	    char gender='M';
	    
		if(age>=18&&gender=='M') {
			System.out.println("full ticket");
		}
		if (age>=18||gender=='F')
		{
			System.out.println("stmnt2");
			
		}
		if(!(age>=18||gender=='F')) {
			System.out.println("stmnt 3");
		}
	}

}
