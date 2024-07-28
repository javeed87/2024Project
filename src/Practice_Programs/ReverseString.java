package Practice_Programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String Name="Javeed";
String rev="";

for (int i=Name.length()-1; i>=0; i--)
{
rev=rev+Name.charAt(i);	
}
System.out.println(rev);			
}
}
