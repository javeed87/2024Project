package July;

import java.util.Scanner;

public class Rever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name to reverse");
		String Name=sc.next();
		String Rev="";
		for (int i=Name.length()-1; i>=0; i--)
		{
		Rev=Rev+Name.charAt(i);	
		}
		System.out.println(Rev);
		
	}
}
