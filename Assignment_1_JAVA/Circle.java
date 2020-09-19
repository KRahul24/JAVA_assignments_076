/*
06.	Write a program that takes radius of a circle as input.
	Read the entered radius using Scanner class. 
	Then calculate and print the area and circumference of the circle
*/


import java.util.Scanner;

class Circle
{
	public static void main(String[] args)
	{
		System.out.println("Enter radius: ");
		Scanner sc = new Scanner(System.in);
		float r=sc.nextInt();
		System.out.println("Area: "+(3.14*r*r));
		System.out.println("Circumference: "+(2f*3.14*r));
	}
}