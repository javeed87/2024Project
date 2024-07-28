package Methods;

public class Methodtypes {

	int a;
	int b;
	
	/*Method without parameter
	
	void sum()
	{
		System.out.println(a+b);
	}*/
	
/*Method with parameter
	void sum(int x, int y)
	{
		a=x;
		b=y;
				System.out.println(a+b);
	}*/
// Method with return type
	int sum()
	{
		return(a+b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodtypes cal=new Methodtypes();
/*		cal.a=100;
		cal.b=500;
		cal.sum();*/
/*cal.sum(500, 500);*/
		cal.a=100;
		cal.b=200;
int r=cal.sum();		
		System.out.println(r);
		
		
	}

}
