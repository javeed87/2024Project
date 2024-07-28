package InterviewProgramms;

public class ArratMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {10, 1, 20, 3, 50};
		int max=0;
		for (int i=0; i<=a.length-1; i++)
		{
		if(a[i]>max)
		{
		max=a[i];	
		}
		
		}

		System.out.println(max);			
	}

}
