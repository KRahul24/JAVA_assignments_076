// 16.	Write a program to print table of any entered number using loop

import java.util.Scanner;
class Table
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=scan.nextInt();
		int i=1;
		do
		{
			System.out.println(n*i);
			i++;
		}while(i<=10);
	}
}