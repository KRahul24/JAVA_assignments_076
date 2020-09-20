/*
29.	Write a program to print the total number of one-D arrays in a two-D array 
	and the number of elements in every one-D array present in the two-D arrays.
*/


import java.util.Scanner;

class Array2D_1 
{
    public static void main(String[] args) 
	{
        Scanner sc =new Scanner(System.in);
        int [][]ar=new int[3][4];

        for(int i=0;i<ar.length;i++)
		{
            for(int j=0;j<ar[i].length;j++)
			{
                ar[i][j]=sc.nextInt();
            }
        }
		
		System.out.println("Number of arrays: "+ar.length);
		
        int count=0;
        for(int p[]:ar)
		{
            for(int q:p)
			{
                count++;
            }
        }
		
		System.out.println("Total elements: "+count);
    }
}
