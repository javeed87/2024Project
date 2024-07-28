package Array;

public class TwoDimeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]=new int[3][2];

a[0][0]=20;
a[0][1]=40;

a[1][0]=60;
a[1][1]=80;

a[2][0]=100;
a[2][1]=120;

for (int i=0; i<=2; i++)
{
for (int j=0; j<=1; j++)
{
System.out.print(a[i][j]+" ");	
}
System.out.println();
}



	}

}
