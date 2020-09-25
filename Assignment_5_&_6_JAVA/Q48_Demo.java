/*
48.	Create an Abstract class Processor with int member variable data  and method showData to display data value.
	Create abstract method process() to define processing of member data. 
	a. Create a class  Factorial using abstract class Processor  to calculate and print factorial of a number by overriding the process method. 
	b. Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding the process method.
	Ask user to enter choice (factorial or circle area).  
	Also ask data to work upon. Use Processor class reference to achieve this mechanism.
*/

import java.util.Scanner;
abstract class Processor
{
	float data=1;
	void showData()
	{
		System.out.println(data);
	}
	abstract void process(float num);
}

class Factorial extends Processor
{
	void process(float num) 
	{
		for(float i=num; i>=1; i--)
		{
			data*=i;
		}
	}
}

class Circle extends Processor
{
	void process(float num) 
	{
		float area=3.14f*num*num;
		data=area;
	}
}

class Q48_Demo
{
	public static void main(String[] args)
	{
		System.out.println("Select number of choice: 1) Factorial 2) Area of circle");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		Processor f1=new Factorial();
		Processor f2=new Circle();
		
		switch(c)
		{
			case 1:
			{
				float num;
				System.out.print("Enter a number: ");
				num=sc.nextInt();
				f1.process(num);
				f1.showData();
				break;				
			}
			case 2:
			{
				float num;
				System.out.print("Enter a number: ");
				num=sc.nextInt();
				f2.process(num);
				f2.showData();
				break;
			}
			default:
			{
				System.out.print("Inavlid Choice!!");
			}
		}
	}
}