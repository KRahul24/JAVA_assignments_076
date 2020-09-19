// 20.	Print all prime numbers between two given numbers. [ break continue ]

import java.util.Scanner;
class PrimeInRange
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter lower range: ");
		int lower=scan.nextInt();
		System.out.print("Enter upper range: ");
		int upper=scan.nextInt();

		for(int i=lower; i<=upper; i++)
		{
			int x=i/2;
			if(i==0||i==1)
			{
			}
			else
			{
				boolean flag=true;
				for(int j=2; j<=x; j++)
				{
					if(i%j==0)
					{
						flag=false;
					}
				}
				if(flag==true)
				{
					System.out.println(i);
				}
			}
		}
	}
}