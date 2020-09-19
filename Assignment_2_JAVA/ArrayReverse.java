//23.	Write a program to reverse the array elements


import java.util.*;
class ArrayReverse
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 7 numbers: ");
		int arr[]=new int[7];
		int s=0,e=arr.length-1;
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=scan.nextInt();
		}

		for(int j=1; j<=arr.length/2; j++)
		{
			arr[s]=arr[e]+arr[s];
			arr[e]=arr[s]-arr[e];
			arr[s]=arr[s]-arr[e];
			s+=1;
			e-=1;
		}
			
		
		System.out.println("Array in reverse order: ");
		for(int i:arr)
		{
			System.out.println(i);
		}
		
	}
}