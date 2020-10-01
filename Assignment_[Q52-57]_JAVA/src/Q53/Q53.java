package Q53;
public class Q53 
{
	public static void main(String[] args) 
	{
		int sum=0;
		String s= new String("67, 89, 23, 67, 12, 55, 66");
		String ar[]=s.split(", ");
		for(String str:ar)
		{
			sum+=Integer.parseInt(str);
		}
		System.out.println("Sum: "+sum);
	}
}
