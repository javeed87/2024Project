package StaticNonStatic;

public class Staticnonstatic {

 static int a=100;
 int b=300;
 
 void m2()
 {
	 System.out.println(b);
 }
	
 static void m1()
 {
	 System.out.println(a);
 }	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
m1();
Staticnonstatic show=new Staticnonstatic();
		show.m2();
		
	}

}
