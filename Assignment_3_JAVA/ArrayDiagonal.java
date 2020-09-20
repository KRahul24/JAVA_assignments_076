/*
30.	Create an integer type 2-D array of size [3X3]. 
	Take the elements from the user and then calculate the sum of the elements present in the diagonal.
*/

	import java.util.Scanner;

	class ArrayDiagonal
	{
		public static void main(String[] args) 
		{
			Scanner sc =new Scanner(System.in);
			int [][]ar=new int[3][3];
			
			System.out.println("Enter 3*3 elements:");
			for(int i=0;i<ar.length;i++)
			{
				for(int j=0;j<ar[i].length;j++)
				{
					ar[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Diagonal Elements:");
			
			for(int i=0;i<ar.length;i++)
			{
				for(int j=0;j<ar[i].length;j++)
				{
					if(i==j)
					{
						System.out.println(ar[i][j]);
					}
				}
			}
		}
	}
	