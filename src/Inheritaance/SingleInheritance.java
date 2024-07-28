package Inheritaance;

class A
{
	int a;
	int b;
void display()
{
	System.out.println(a+b);
}
}

class B extends A
{
int x;
int y;
void show()
{
System.out.println(x*y);	
}
}






public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A aobj=new A();
		aobj.a=20;
		aobj.b=20;
		aobj.display();

		B bobj=new B();
		bobj.a=20;
		bobj.b=20;
		bobj.x=50;
		bobj.y=60;
		bobj.show();
		aobj.display();		
		
		
	}

}
