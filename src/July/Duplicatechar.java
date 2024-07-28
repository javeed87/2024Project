package July;

import java.util.Scanner;

public class Duplicatechar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		char[] carry=s.toCharArray();
		
		System.out.print("Duplicate Characters in above string are: ");
		//String s="Mohammed Javeed";
       
        
        
        
        
	      
	      
        for(int i=0; i<s.length(); i++) {
        	for(int j=i+1; j<s.length(); j++) {
        		if(carry[i] == carry[j])
        		{
        			System.out.print(carry[i]);
            		break;
            
        		}
        			}
        }
		
		
}
	}
