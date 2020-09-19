/*
03.	Find the result of following expressions. 
	You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
	A. y = x2 + 3x - 7 (print value of y)	 
	B. y = x++ + ++x (print value of x and y) 
	C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
	D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ] 
*/

class Arithmetics
{
	public static void main(String[] args)
	{
		int x=2;
		int y=4;
		int z=5;
		
		y=x^2+3*x-7;
		System.out.println(y);
		
		y= x++ + ++x;
		System.out.println(x);
		System.out.println(y);
		
		z= x++ - --y - --x + x++;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		boolean a=true;
		boolean b=false;
		boolean c=a&&b||!(a||b);
		System.out.println(c);
	}
}