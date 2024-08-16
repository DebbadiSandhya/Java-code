package daily;
public class This_call
{
    This_call(int age){
	
	    System.out.println(age);
}
    This_call(double weight)
{ 
    	this(40);
	    System.out.println(weight);

}
    This_call(String name){
	     this(65.4);
	    System.out.println(name);

}

	public static void main(String[] args) {
		
		new This_call("sam");

		
	}

}
