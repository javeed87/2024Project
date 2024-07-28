package Accenture;

import java.util.Scanner;

public class IdentifyGreaterno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		
		if(no1<no2)
		{
			System.out.println("no2 is a grater number"+ no2);
		}
		else
		{
			System.out.println("no1 is a grater number"+ no1);	
		}
		
		
		
	}

}
