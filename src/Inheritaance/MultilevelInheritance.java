package Inheritaance;

class W
{
int a;
int b;
void display()
{
System.out.println(a+b);	
}
}

class Z extends W
{
int x;
int y;
void show()
{
System.out.println(x*y);	
}
}

class V extends Z
{
int p;
int q;
void print()
{
System.out.println(p/q);	
}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
V cobj=new V();
cobj.a=10;
cobj.b=20;
cobj.x=30;
cobj.y=40;
cobj.p=50;
cobj.q=60;
cobj.display();
cobj.show();
cobj.print();
	}

}
