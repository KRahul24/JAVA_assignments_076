package Q55;

import java.util.Scanner;
public class Q55 
{
	static int count=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s=sc.nextLine();
		String ar[]=s.split(" ");
		for(String str:ar)
		{
			count++;
		}
		System.out.println("Total words: "+count);
	}

}
