/*
40.	Create a class Student having data members name, roll no., age and score. 
	Write a program to accept 10 records of student and store them in an array. And then arrange the student records based on the score group [0-50], [50-65], [65-80], [80-100].
*/

import java.util.Scanner;

class Student
{
	int roll,age;
	float score;
	String name;
	
	Student(int roll,String name,int age,float score)
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.score=score;
	}
	
	static float total(Product []p)
	{
		Product test;
		float sum=0;
		for(int i=0; i<p.length; i++)
		{
			test=p[i];
			sum=sum+(test.quantity*test.price);
		}
		return sum;
	}
}

class StudentDemo1
{
	public static void main(String[] args)
	{	
		int roll,age;
		float score;
		String name;
		Scanner scan=new Scanner(System.in);
		Student s[]=new Student[10];
		Student test;
		
		for(int i=0; i<4; i++)
		{
			System.out.println("Enter roll, name, age and score:");
			roll=scan.nextInt();
			name=scan.next();
			age=scan.nextInt();
			score=scan.nextFloat();
			
			Student s1=new Student(roll,name,age,score);
			s[i]=s1;
			
		}
		
		System.out.println("Students who scored between [80-100]: ");
		for(int i=0; i<4; i++)
		{
			if(s[i].score>=80 && s[i].score<=100)
			{
				System.out.println("Roll: "+s[i].roll+"    Name: "+s[i].name+"    Age: "+s[i].age+"    Score: "+s[i].score+"%");
			}
		}
		
		System.out.println("Students who scored between [65-80]: ");
		for(int i=0; i<4; i++)
		{
			if(s[i].score>=65 && s[i].score<80)
			{
				System.out.println("Roll: "+s[i].roll+"    Name: "+s[i].name+"    Age: "+s[i].age+"    Score: "+s[i].score+"%");
			}
		}
		
		System.out.println("Students who scored between [50-65]: ");
		for(int i=0; i<4; i++)
		{
			if(s[i].score>=50 && s[i].score<65)
			{
				System.out.println("Roll: "+s[i].roll+"    Name: "+s[i].name+"    Age: "+s[i].age+"    Score: "+s[i].score+"%");
			}
		}
		
		System.out.println("Students who scored between [45-50]: ");
		for(int i=0; i<4; i++)
		{
			if(s[i].score>=45 && s[i].score<50)
			{
				System.out.println("Roll: "+s[i].roll+"    Name: "+s[i].name+"    Age: "+s[i].age+"    Score: "+s[i].score+"%");
			}
		}
	}
}