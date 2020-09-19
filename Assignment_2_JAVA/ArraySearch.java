//24.	Write a program to search an element in the array

import java.util.*;
class ArraySearch
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 7 numbers: ");
		int arr[]=new int[7];
		int flag=0;
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.print("Enter a number to search in the array: ");
		int num=scan.nextInt();
		for(int j=0; j<arr.length; j++)
		{
			if(arr[j]==num)
			{
				System.out.println("Number found at "+j+"th index");
				flag++;
			}
		}
			
		if(flag==0)
		{
			System.out.println("Enement not found");
		}
		
	}
}