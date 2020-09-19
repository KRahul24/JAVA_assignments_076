//21.	Program to show sum and average of 10 element array. Accept array elements from user. 

import java.util.Scanner;
class ArraySum
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		int arr[]=new int[10];
		int sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i:arr)
		{
			sum=sum+i;
		}
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+(sum/arr.length));
	}
}