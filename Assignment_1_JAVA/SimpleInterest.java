//08.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.

import java.util.Scanner;
class SimpleInterest
{
	public static void main(String[] args)
	{
		System.out.println("Enter amount, rate of interest and time in years:");
		Scanner sc=new Scanner(System.in);
		float amount= sc.nextFloat();
		float rate= sc.nextFloat();
		float year= sc.nextFloat();
		
		float interest=(amount*rate*year)/100;
		System.out.println("Simple Interest: "+interest);
	}
	
}