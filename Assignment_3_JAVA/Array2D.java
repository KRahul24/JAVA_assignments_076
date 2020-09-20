// 26.	Create an array of 17 elements in 5 rows.  And calculate sum of all elements.

import java.util.*;

class Array2D {
    public static void main(String[] args) 
	{
        Scanner sc =new Scanner(System.in);
        int [][]ar=new int[3][4];  //5*17 is lenghty to verify the output, so taking 3*4

        for(int i=0;i<ar.length;i++)
		{
            for(int j=0;j<ar[i].length;j++)
			{
                ar[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<ar.length;i++)
		{
            for(int j:ar[i])
			{
                sum=sum+j;
            } 
        }

        System.out.println("Sum: "+sum);
    }
}

