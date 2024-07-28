package Practice_Programs;

public class SrtingReversal19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Name="Javeed";
	
		String Rev="";
		
		for (int i=Name.length()-1; i>=0; i--)
		{
			Rev=Rev+Name.charAt(i);
		}
		System.out.println(Rev);	
		
	}

}
