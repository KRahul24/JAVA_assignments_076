// 27.	Write a program to fine the smallest and greatest number present in the array of integer type.

import java.util.Scanner;
class Find
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("How many numbers: ");
		int n= scan.nextInt();
		int arr[]=new int[n];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max=max+arr[i];
				arr[i]=max-arr[i];
				max=max-arr[i];
			}
		}
		
		int min=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(min>arr[i])
			{
				min=min+arr[i];
				arr[i]=min-arr[i];
				min=min-arr[i];
			}
		}
		
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}
}