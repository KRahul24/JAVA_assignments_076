// 14.	Program to check that entered year is a leap year or not.


import java.util.Scanner;
class Leap
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year=scan.nextInt();
		if(year%400==0)
		{
			System.out.println("Leap year!");
		}
		else if(year%4==0)
		{
			if(year%100==0)
			{
				System.out.println("Non-leap year!");
			}
			else
			{
				System.out.println("Leap year!");
			}
		}
		else
		{
			System.out.println("Non-leap year!");
		}
		
	}
}