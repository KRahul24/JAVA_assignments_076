/*
09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class.
	Now convert the entered days into complete years, months and days and print them.
*/

import java.util.Scanner;
class DaysToYears
{
	public static void main(String[] args)
	{
		System.out.print("Enter number of days: ");
		Scanner scan=new Scanner(System.in);
		int days=scan.nextInt();
		int years=days/365;
		int months=(days%365)/30;
		int days1=(days%365)%30;
		System.out.println("Years: "+years+" Months: "+months+" Days: "+days1);
	}
}