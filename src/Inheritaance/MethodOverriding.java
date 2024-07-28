package Inheritaance;

class Bank
{
int rateofintrest(int x, int y) {
return 0;	
}
}

class SBI extends Bank
{
int rateofintrest()
{

return 20;
}
}

class ICICI extends Bank
{
int rateofintrest()
{
return 10;
}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b=new Bank();
		b.rateofintrest(10, 20)
		//System.out.println(b.rateofintrest(20, 30));
		
ICICI r=new ICICI();
System.out.println(r.rateofintrest());
	}

}
