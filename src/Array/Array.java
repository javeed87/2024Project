package Array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]=new int[5];
 
 a[0]=1000;
 a[1]=20;
 a[2]=40;
 a[3]=50;
 a[4]=220;
 
 /*for(int i=0; i<=4; i++)
 {
	System.out.println(a[i]); 
	}*/
 for(int i:a)
 {
	 System.out.println(i); 
 }

}
}