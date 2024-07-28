package Practice_Programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
		int no=sc.nextInt();
		int temp=no;
		int rev=0;
		int rem;
		while (temp!=0)
		{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		}
		if (no==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");	
		}
	}

}
