package daily;

public class Con_nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char gender_1='M';
		/*char gender_2='F'*/;
		int age_kid=4;
		/*int age_adult_male=32; */
		/*int age_adult_female=30; */
		
		if(gender_1!='M')
		{
			if(age_kid<=4)
			{
				System.out.println("ticket is free");
				
			}
			else
			{
				System.out.println("full ticket");

			}
		}
		else
		{
			System.out.println("ticket is free for Female");

		}
		
	}

}
