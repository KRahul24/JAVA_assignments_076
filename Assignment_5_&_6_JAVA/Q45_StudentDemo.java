/*
45.	-Create a class Student with two members : rollno and percentage. 
	 Create default and parameterized constructors. Create method show() to display information. 
	-Create another class CollegeStudent inherits Student class. Add a new member semester to it. 
	 Create default and parameterized constructors. Also override show() method that calls super class show() method and displays semester. 
	-Create another class SchoolStudent inherits Student class. Add a new member className(eg 12th ,10th etc.) to it. 
	 Create default and parameterized constructors. Also override show() method that calls super class show() method and displays className.
	
	Create a class( say Demo) with main method that carries out the operation of the project : 
		-- has array to store objects of any class(Student,  CollegeStudent or SchoolStudent) 
		-- create two CollegeStudent  and three SchoolStudent objects and store them inside the array 
		-- displaxy all records from the array 
		-- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent. 
		-- count how many students are having A grade, if for A grade percentage >75.)
*/

import java.util.Scanner;

class Student
	{
		int rollno;
		float percentage;
		
		Student()
		{
			rollno=1;
			percentage=60f;
		}
		Student(int rollno,float percentage)
		{
			this.rollno=rollno;
			this.percentage=percentage;
		}
		void show()
		{
			System.out.println("Roll no: "+rollno);
			System.out.println("Percentage: "+percentage);
		}
	}
	
	
class CollegeStudent extends Student
	{
		int semester;
		
		CollegeStudent()
		{
			semester=1;
		}
		CollegeStudent(int rollno, float percentage,int semester)
		{
			super(rollno,percentage);
			this.semester=semester;
		}
		
		void show()
		{
			super.show();
			System.out.println("Semister : "+semester+"\n");
		}
	}
	
	
class SchoolStudent extends Student
	{
		String className;
		
		SchoolStudent()
		{
			className="CS";
		}
		SchoolStudent(int rollno, float percentage,String className)
		{
			super(rollno,percentage);
			this.className=className;
		}
		
		void show()
		{
			super.show();
			System.out.println("Class Name : "+className+"\n");
			
		}
		
	}


class Q45_StudentDemo
	{
		public static void main(String args[])
		{
			int count=0;  //why cant we make this static??
			CollegeStudent c1=new CollegeStudent(100,90.18f,2);
			CollegeStudent c2=new CollegeStudent(101,82.0f,3);
			SchoolStudent s1=new SchoolStudent(101,87.36f,"Science");
			SchoolStudent s2=new SchoolStudent(102,85.56f,"Commerce");
			SchoolStudent s3=new SchoolStudent(103,69.19f,"Arts");
			
			Student ar[]=new Student[]{c1,c2,s1,s2,s3};
			
			for(Student ref: ar)
			{
				ref.show();
			}
			
			Scanner scan=new Scanner(System.in);
			System.out.print("\n\n Enter roll no.:");
			int rollno=scan.nextInt();
			
			for(Student ref: ar)
			{
				if(rollno==ref.rollno)
				ref.show();
			}
			
			for(Student ref: ar)
			{
				if(ref.percentage>75)
				count++;
			}
			System.out.print("Number of Students having A grade: "+count);
		}
	}