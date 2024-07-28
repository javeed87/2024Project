package Oops;

public class ConstructorOverLoading {
int a=20;
int b=30;
double c=0;
ConstructorOverLoading()
{
a=100;
b=400;
}
ConstructorOverLoading(int x, int y)
{
a=x;
b=y;
}

void display()
{
System.out.println(a/b);	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorOverLoading c=new ConstructorOverLoading(22, 11);
c.display();
	}

}
