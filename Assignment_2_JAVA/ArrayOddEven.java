//24.	Write a program to search an element in the array

import java.util.*;
class ArrayOddEven
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 7 numbers: ");
		int arr[]=new int[7];
		int oddSum=0;
		int evenSum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(int j=0; j<arr.length; j++)
		{
			if(arr[j]%2==0)
			{
				evenSum=evenSum+arr[j];
			}
			else
			{
				oddSum=oddSum+arr[j];
			}
		}
		
		System.out.println("Sum of Even numbers: "+evenSum);
		System.out.println("Sum of Odd numbers: "+oddSum);
	}
}