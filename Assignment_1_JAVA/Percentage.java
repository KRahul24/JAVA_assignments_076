/*
07.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
	Take the obtained marks from user using Scanner class. 
	Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.
*/

import java.util.Scanner;

class Percentage
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks of five subjects: ");
		float m1= scan.nextFloat();
		float m2= scan.nextFloat();
		float m3= scan.nextFloat();
		float m4= scan.nextFloat();
		float m5= scan.nextFloat();
		float per=(m1+m2+m3+m4+m5)/5;
		System.out.println(per+"%");
	}
}