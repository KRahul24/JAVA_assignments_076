// 05.	Write a program that takes user’s name as command line argument and prints Welcome <entered user name>. 

import java.util.Scanner;
class Welcome
{
	public static void main(String[] args)
	{
		System.out.println("Enter your name: ");
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		System.out.println("Welcome "+name);
	}
}