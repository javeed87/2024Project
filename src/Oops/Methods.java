package Oops;

public class Methods {

	int empid;
	String empName;
	int Salary;
	String department;
	
	void setdata(int eid, String ename, int sal, String dep)
	{
	empid=eid;
	empName=ename;
	Salary=sal;
	department=dep;
	}
	
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empName);
		System.out.println(Salary);
		System.out.println(department);
	}
	
	public static void main(String args[])
	{
		Methods emp1=new Methods();
		emp1.setdata(1, "MJ", 20, "QC");
		emp1.display();
		Methods emp2=new Methods();
		emp2.setdata(2, "MJM", 10, "QA");
		emp2.display();
		
	}
	
}
