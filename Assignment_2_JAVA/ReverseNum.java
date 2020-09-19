// 17.	Write a program to reverse a given number.


import java.util.Scanner;
class ReverseNum
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scan.nextInt();
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse: "+rev);
	}
}