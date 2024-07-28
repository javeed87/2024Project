package Oops;

public class Constructor {

	int empId;
	String empName;
	int Salary;
	String department;
	
	Constructor (int eid, String ename, int sal, String dep)
	{
	empId=eid;
	empName=ename;
	Salary=sal;
	department=dep;
	}
	
	void display()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(Salary);
		System.out.println(department);
	}
	
	public static void main(String args[])
	{
	Constructor emp1=new Constructor(100, "Mohammed", 25000, "CMT");	
	emp1.display();
	Constructor emp2=new Constructor(101, "Khan", 35000, "QEA");	
	emp2.display();
	}
	
}
