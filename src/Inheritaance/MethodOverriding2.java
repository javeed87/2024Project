package Inheritaance;
class vehicle
{
void run()
{
System.out.println("Running1");	
}
}

class Bike extends vehicle
{
void run()
{
System.out.println("Running");	
}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
vehicle r=new vehicle();
r.run();
	}

}
