/*
34.	Create a class Circle that has two data members, one to store the radius and another to store area 
	and three methods first init() method to input radius from user, second calculateArea() method to calculate area of circle 
	and third display() method to display values of radius and area. 
	Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.
*/

import java.util.Scanner;

class Circle
{
	float r;
	float a;
	
	void init(float r)
	{
		this.r=r;
	}
	
	void calculateArea()
	{
		a=3.14f*r*r;
	}
	
	void display()
	{
		System.out.println("Radius: "+r);
		System.out.println("Area: "+a);
	}
}

class CircleDemo
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Radius: ");
		float r=scan.nextFloat();
		Circle c=new Circle();
		c.init(r);
		c.calculateArea();
		c.display();
	}
}