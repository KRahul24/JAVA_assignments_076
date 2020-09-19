/*
13.	Program to find greatest in 3 numbers. 
	[ once using if else statement and then using ternary operator ( logical operator) ]  
*/

import java.util.Scanner;
class Greatest
	{
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter three numbers: ");
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			
				//Using if-else
			if(a>=b&&a>=c)
				{
					System.out.println("Greatest number: "+a);
				}
			else if(b>=a&&b>=c)
				{
					System.out.println("Greatest number: "+b);
				}
			else
				{
					System.out.println("Greatest number: "+c);
				}
				
					//Using Ternary operator
			int d=(a>=b&&a>=c)?a:(b>=a&&b>=c)?b:c;
			System.out.println("Greatest number using ternary operator: "+d);
		}
		
	}