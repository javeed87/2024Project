package Array;

public class ForeLoop2dimenionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]=new int[3][2];

a[0][0]=11;
a[0][1]=12;

a[1][0]=22;
a[1][1]=21;		

a[2][0]=33;
a[2][1]=34;

for (int i[]:a)
{
for (int j:i)
{
System.out.print(j+" ");	
}
System.out.println();
}



	}

}
