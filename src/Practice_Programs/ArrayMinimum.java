package Practice_Programs;

public class ArrayMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= new int[]{20, 1, 100, 300};
	
		int len=a.length;
	
		int min=a[0];
		
	for (int i=0; i<=len-1; i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
		
	}
	System.out.println(min);	
		
	}

}
