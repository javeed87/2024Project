package Oops;

public class MethodOverLoadin {

	int a=10;
	int b=20;
	
	void sum()//First Method without parameter
	{
	System.out.println(a+b);
	}
	
	void sum (int x, int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);	
	}
	
	void sum (int x, double y)
	{
		System.out.println(x+y);	
	}
	
	void sum (int x, double y, int z)
	{
		System.out.println(x+y);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverLoadin s=new MethodOverLoadin();
s.sum();
s.sum(60, 80.5, 90);
s.sum(50, 100);
s.sum(10, 20.5);
	}

}
