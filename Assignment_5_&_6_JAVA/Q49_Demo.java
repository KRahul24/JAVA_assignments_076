/*
49.	Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. 
	create abstract method calcTax().
	a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary. 
	b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product. 
	c. Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax and sales tax 	respectively.
*/


import java.util.Scanner;
interface Taxable
{
	float salesTax=7;
	float incomeTax=10.5f;
	void calcTax();
}

class Employee implements Taxable
{
	int empId;
	String name;
	float salary;
	Employee(int empId,String name,float salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	public void calcTax()   // making public is must as interface methods are by default public, so we cant narrow the access!!!
	{
		float tax=salary*incomeTax*12/100;
		System.out.println("Income tax on yearly salary: "+tax);
	}
}

class Product implements Taxable
{
	int pid;
	int quantity;
	float price;
	Product(int pid,int quantity,float price)
	{
		this.pid=pid;
		this.quantity=quantity;
		this.price=price;
	}
	public void calcTax()
	{
		float tax=price*quantity*salesTax/100;
		System.out.println("Sales tax on unit product: "+tax);
	}
}

class Q49_Demo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Empoyee ID, Name and Salary:");
		int empId=sc.nextInt();
		String name=sc.next();
		float salary=sc.nextFloat();
		
		Taxable T1=new Employee(empId,name,salary);
		T1.calcTax();
		
		System.out.println("\n Enter Product ID, Quantity and price:");
		int pid=sc.nextInt();
		int quantity=sc.nextInt();
		float price=sc.nextFloat();
		
		Taxable T2=new Product(pid,quantity,price);
		T2.calcTax();
	}
}