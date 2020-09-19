// 11.	Write a program to swap two numbers without using third variable.


import java.util.Scanner;
class Swap
{
	public static void main(String[] args)
	{
		System.out.println("Enter 1st number: ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println("Enter 2nd number: ");
		int b=scan.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("1st number: "+a+" and 2nd number: "+b);
	}
}