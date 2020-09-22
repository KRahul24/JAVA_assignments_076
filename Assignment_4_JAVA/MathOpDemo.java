/*
35.	Create a class MathOperation that has four static methods- 
	i)  add() method that takes two integer numbers as parameter and returns the sum of the numbers. 
	ii) subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. 
	iii) multiply() method that takes two integer numbers as parameter and returns the product. 
	iv) power() method that takes two integer numbers as parameter and returns the power of first number to second number. 
*/

import java.util.Scanner;
import java.lang.Math;
class MathOperation
{
	
	int add(int a,int b)
	{
		int s=a+b;
		return s;
	}
	
	int subtract(int a,int b)
	{
		int d=a-b;
		return d;
	}
	
	int multiply(int a, int b)
	{
		int m=a*b;
		return m;
	}
	
	double power(double a,double b)
	{
		double p=Math.pow(b,a);
		return p;
	}
}

class MathOpDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		MathOperation M1=new MathOperation();
		
		int s=M1.add(a,b);
		System.out.println("Sum: "+s);
		
		int d=M1.subtract(a,b);
		System.out.println("Subtract: "+d);
		
		int m=M1.multiply(a,b);
		System.out.println("Multiplication: "+m);
		
		double p=M1.power(a,b);
		System.out.println("Power: "+p);
	}
}