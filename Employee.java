package Week1.day2;

public class Employee {

	public static void main(String args[])
	{
		empinfo e=new empinfo();
		e.EmpName("Ajay", 187361);
		e.getEmplAddress("5th block street KPM");
		e.empSalary(3500000);
		e.empMobile(9942369329l);
	}
	
	
}

class empinfo
{
	public void EmpName(String Empname,int Empno)
	{
		System.out.println("Employee details{s} and Employee no {d}" + Empname + Empno);
		
	}
	public void getEmplAddress(String empAddress)
	{
		System.out.println("Employee Address {s}"+empAddress);
		
	}
	public void empSalary(double empSalary)
	{
		System.out.println("Employee Salary {d}"+ empSalary);
		
	}
	public void empMobile(long empNo)
	{
		System.out.println("Employee contact no"+empNo);
	}
	
}