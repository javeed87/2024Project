package Accenture;

import java.util.Scanner;

public class ReverseStg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String name=sc.next();
		String rev="";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			rev=rev+name.charAt(i);
			
		}
		System.out.println(rev);
	}

}
