package assignment7;

class Employee
{
	int empid;
	String name;
	public Employee(int empid, String name) 
	{
		super();
		this.empid = empid;
		this.name = name;
	}
	
}

public class Q50
{
	public static void main(String[] args)
	{
		Employee e=new Employee(12324, "Rahul");
		System.out.println(e);		// As we have not overridden the toString method, control will go to superclass of employee which in this case we havent provided. but its default superclass is Object and its toString method will be called!  
	}
}
