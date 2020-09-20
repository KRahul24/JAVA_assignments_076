// 28.	Initialize one String type of array and print the elements using for each loop.


import java.util.Scanner;
class ArrayString
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("How many strings: ");
		int n= scan.nextInt();
		String arr[]=new String[n];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=scan.next();
		}
		
		for(String names:arr)
		{
			System.out.print(names+" ");
		}
	}
}