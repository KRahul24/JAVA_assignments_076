/*
12.	In a company an employee is paid as under: 
	If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. 
	If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. 
	If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]
*/


import java.util.Scanner;
class Salary
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Salary");
		double sal=sc.nextDouble();
		if(sal<10000)
		{
			System.out.println("Gross Salary: "+(sal+(10*sal/100)+(90*sal/100)));
		}
		else if(sal>=10000)
		{
			System.out.println("Gross Salary: "+(sal+2000+(98*sal/100)));
		}
	}
}