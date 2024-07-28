package Practice_Programs;

public class Arraymax19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {4, 20, 55};
		
		int max=a[0];
		for (int i=0; i<=a.length-1; i++)
		{
		if (a[i]>max)
		{
		max=a[i];
		}
		}
		System.out.println(max);
			
	}

}
