//33.	Write a program to demonstrate functionalities of this keyword in java.



	//1. To refer variables of the current instance(object)

import java.util.Scanner;

class Student
{
	int roll;
	String name;
	
	void setData(int roll, String name)
	{
		this.roll=roll;
		this.name=name;
	}
	
	void showData();
	{
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+roll);
	}
}

class StudentDemo()
{
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter Roll no: ");
	int roll=scan.nextInt();
	System.out.print("Enter Name: ");
	String name=scan.next();
	
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.setData(roll,name);
	}
}
























