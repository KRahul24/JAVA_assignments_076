//46.	Create a program to demonstrate the use of instanceof operator or secure reference down casting.

class Person
{
	String name;
	int age;
	
	Person(String name, int age)
	{
		this.age=age;
		this.name=name;
	}
	
	void show()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

class Employee extends Person
{
	float salary;
	
	Employee(String name,int age,float salary)
	{
		super(name,age);
		this.salary=salary;
	}
	
	void show()
	{
		super.show();
		System.out.println("Salary: "+salary);
		
	}
}

class Q46_Demo
{
	public static void main(String[] args)
	{
		Person p[]={new Employee("Ram",24,15000), new Person("Shyam",23)};
		
		for(Person ref:p)
		{
			if(ref instanceof Employee) //use of instanceof operator for secure dowmcasting. (here, for downcasting, instance must be of employee!)
			{
				Employee e=(Employee)ref;
				ref.show();
			}
		}
	}
}