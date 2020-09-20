/*
31.	Create a class Student with 2 data members rno and name. 
	Create one method setData() that takes roll number and student name as parameter and stores them in data members rno and name. 
	Create one more method showData() to print the data member values. 
	Create another class ( main class) StudentDemo that creates Student class object and calls setData() and showData() methods.
*/


//32.	Modify the above program (no. 31) to count the no of Student objects created. [ In this program static variable is required ]



import java.util.Scanner;
class Student1
{
	int rno;
	String name;
	static int count=0;
	
	Student1()
	{
		count++;
	}
	
	void setData(int rno, String name)
	{
		this.rno=rno;
		this.name=name;
	}
	
	void showData()
	{
		System.out.println("Roll No.: "+rno);
		System.out.println("Name: "+name);
	}
}

class StudentDemo1
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter roll no: ");
		int rno=scan.nextInt();
		System.out.println("Enter Name: ");
		String name=scan.next();
		
		Student1 s1=new Student1();
		s1.setData(rno,name);
		s1.showData();
		
		Student1 s6=new Student1();
		Student1 s2=new Student1();
		Student1 s3=new Student1();
		Student1 s4=new Student1();
		Student1 s5=new Student1();
		
		System.out.println("Total objects: "+s1.count);
		
	}
}