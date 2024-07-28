package Oops;

public class employee {

	int empId;
	int salary;
	String empName;
	String designation;
	
	void display()
			{
		System.out.println(empId);
		System.out.println(salary);
		System.out.println(empName);
		System.out.println(designation);
			}
	public static void main(String args[])
	{
		employee e1=new employee();
		e1.empId=123456;
		e1.salary=100000;
		e1.empName="Javeed";
		e1.designation="QEA";
	e1.display();	
	
	employee e2=new employee();
	e2.empId=78910;
	e2.salary=150000;
	e2.empName="Mohd";
	e2.designation="Manual";
e2.display();
	}
	
	
	
	
}
