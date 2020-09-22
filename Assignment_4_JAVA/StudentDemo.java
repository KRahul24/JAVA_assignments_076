//33.	Write a program to demonstrate functionalities of this keyword in java.


/*
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
	
	void showData()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+roll);
	}
}

class StudentDemo
{
	int roll;
	String name;
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Roll no: ");
		int roll=scan.nextInt();
		System.out.print("Enter Name: ");
		String name=scan.next();
		
		Student s1=new Student();
		s1.setData(roll,name);
		s1.showData();
	}
}
*/




/*
	//2. To call current class constructors(Concept of CONSTRUCT)

import java.util.Scanner;

class Student
{
	int roll;
	String name;
	
	Student(int roll,String name)
	{
		System.out.println("IN 2-PARAMERIZED CONSTRUCTOR");
		this.roll=roll;
		this.name=name;
		
	}
	
	Student(int roll, String name, String gender)
	{
		
		this(roll,name);
		System.out.println("IN 3-PARAMERIZED CONSTRUCTOR");
		System.out.println("Name: "+this.name);
		System.out.println("Roll no: "+this.roll);	
		System.out.println(gender);
		
	}
}

class StudentDemo
{
	int roll;
	String name;
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Roll no: ");
		int roll=scan.nextInt();
		System.out.print("Enter Name: ");
		String name=scan.next();
		System.out.print("Gender: ");
		String gender=scan.next();
		
		Student s1=new Student(roll,name,gender);
	}
}
*/




	//3. To pass current object as parameter of method.

import java.util.Scanner;

class Student
{
	int roll;
	String name;
	
	Student()
	{
		System.out.println("IN NON-PARAMERIZED CONSTRUCTOR");
		this.roll=12324;
		this.name="Rahul";
		
	}

	Student(int roll,String name)
	{
		System.out.println("IN 2-PARAMERIZED CONSTRUCTOR");
		this.roll=roll;
		this.name=name;
		
	}
	
	void test()
	{
		showData(this);
	}
	
	void showData(Student obj)
	{
		System.out.println("Name: "+obj.name);
		System.out.println("Roll no: "+obj.roll);	
	}
}

class StudentDemo
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Roll no: ");
		int roll=scan.nextInt();
		System.out.print("Enter Name: ");
		String name=scan.next();
		
		Student s1=new Student(roll,name);
		s1.test();
		Student s2=new Student();
		s2.test();
	}
}













