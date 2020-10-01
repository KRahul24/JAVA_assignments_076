package assignment7;
import java.util.*;
class Employee2
{
	int empid;
	String name;
	float salary;
	void input(int empid, String name, float salary) 
	{
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public boolean equals(Object obj)
	{
		Employee2 E=(Employee2)obj;
		return this.empid==E.empid;
	}
	@Override
	public String toString()
	{
		return "Employee2 [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
public class Q50_a 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		Employee2 e1=new Employee2();
		Employee2 e2=new Employee2();
		Employee2 e3=new Employee2();
		Employee2 e4=new Employee2();
		Employee2 e5=new Employee2();
		
		Employee2 e[]= {e1,e2,e3,e4,e5};
		for(int i=0;i<5;i++)
		{
				System.out.println("Enter empid, name and salary:");
				int empid=sc.nextInt();
				String name=sc.next();
				float salary=sc.nextFloat();
				if(i==0)
				{
					e[i].input(empid, name, salary);
				}
				else 
				{
					e[i].input(empid, name, salary);
					
						if(e[i-1].equals(e[i]))
						{
							System.out.println("This person already exists, Enter again!");
							i=i-1;
						}
				}
		}
		for(Employee2 emp:e)
		{
			System.out.println(emp);
		}
	}
}
