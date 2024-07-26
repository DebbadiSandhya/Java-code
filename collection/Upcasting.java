package collection;

class parent{
	void add()
	{
		System.out.println("add");	
	}
	void sub() {
		System.out.println("sub");
	}
}

public class Upcasting extends parent {
	void mul() {
		System.out.println("mul");
	}
	void div() {
		System.out.println("div");
	}

	public static void main(String[] args) {

		//upcasting a=new upcasting();//creating an object
		parent p=new Upcasting(); //implicit syntax for upcasting
		p.add();
		p.sub();
		parent p1=(parent) new Upcasting();//explicit syntax for upcasting
		p1.add();
		p1.sub();
	Upcasting  u=(Upcasting) p1;//explicit manner syntax for downcasting, only explicit is possible
	       u.add();             //downcasting is not possible without upcasting
	       u.div();
	       u.mul();
	       u.sub();
	}

}
