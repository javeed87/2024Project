package Practice_Programs;

public class ArrayMaxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {20, 50, 500, 10, 1};
		int max = a[0];
		int len=a.length;
		for(int i=0; i<len; i++)
		{
			if (a[i]>max)
			{
			max=a[i];	
			}	
		}
		System.out.println("Greater array number"+ max);
		
	}

}
