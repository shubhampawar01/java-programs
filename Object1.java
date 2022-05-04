import java.lang.*;

class Employee
{
	public String name;
	public int Salary;
	
	public Employee(String str,int no)
	{
		this.name = str;
		this.Salary = no;
	}
	
	public String toString()
	{
		return "Employee name is "+name+" having salary "+Salary;
	}
	
}
class Object1
{
	public static void main(String a[])throws Exception
	{
		Employee eobj = new Employee("Shubham",22000);
		System.out.println(eobj.toString());
		
	}
}
