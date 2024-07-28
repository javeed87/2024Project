package Strings;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//length(); concat(); replace; contains; equals; equalIgnoreCase; subString; 
	
		String s1= "Mohammed Javeed";
		String s2= "mohammed javeeD";
	System.out.println(s1.length());
	System.out.println(s1.contains("vee"));
	System.out.println(s1.concat(s2));
	System.out.println(s1+s2);
	System.out.println("Bhao"+"Mayo");
	System.out.println(s1.replace("eed", "aaa"));
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.substring(1, 3));
	
	
	}

}
