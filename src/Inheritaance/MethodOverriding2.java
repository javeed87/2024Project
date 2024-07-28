package Inheritaance;

class vehicle
{
void run()
{
System.out.println("Vehicle is running smoothly");	
}
}

class Bike extends vehicle
{
void run()
{
System.out.println("Vehicle is running on 2 wheels");	
}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike r=new Bike();
vehicle v=new vehicle();
r.run();
v.run();
	}

}
