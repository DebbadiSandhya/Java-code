package string_concept;

public class String_functions {

	public static void main(String[] args) {
   
	String name="School name is vidya";
	String name1="   djeWEFMJFJ    ";
	String name2="VIDYA";
	String name3="School123";

	System.out.println(name.length());
	System.out.println(name.toUpperCase());
	System.out.println(name1.toLowerCase());
	System.out.println(name.indexOf("i"));
	System.out.println(name.charAt(0));
	System.out.println(name1.trim());
	System.out.println(name.equals(name1));
	System.out.println(name.contains("is"));
	System.out.println(name.substring(6));
	System.out.println(name2.equalsIgnoreCase("vidya"));
	System.out.println(name.substring(0,6));
	System.out.println(name.isEmpty());
	System.out.println(name.lastIndexOf('i'));
	System.out.println(name.replaceAll(" ",""));
	System.out.println(name.replaceAll("vidya", "sandhya"));
	System.out.println(name3.replaceAll("[0-9]",""));
	System.out.println(name3.replaceAll("[a-z]",""));
	System.out.println(name3.replaceAll("[A-Z]",""));
	System.out.println(name2.matches("(.*)i")); //ends with i
	System.out.println(name2.matches("m(.*)")); //starts with m
	System.out.println(name2.matches("(.*)k(.*)")); //k letter present
	System.out.println(name2.matches(("..."))); //3 letter present



	}

}
