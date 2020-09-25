/*
44.	Create three classes
-	Faculty with two data members facultyId and salary and two methods, one intput() method 
	for accepting facultyId as input and another printSalary() to print salary.
-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance.
	Override input() method in this class that calls super class inut() method and accepts                       
	basicSalary and allowance as input. Salary should not be accepted as input but should be 
	calculated using formula (basicSalary + allowance)
-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour.
	Override input() method in this class that calls super class inut() method and accepts 
	workingHours and ratePerHour as input. Salary should not be accepted as input but should be 
	calculated using formula ( workingHour * ratePerHour )
*/

import java.util.Scanner;

class Faculty
	{
		int facultyId;
		float Salary;
		
		void input(float basicSalary, float allowance, int facultyId)
		{
			this.facultyId=facultyId;
			salary=allowance+basicSalary;
		}
		void printSalary()
		{
			System.out.println("Salary : "+Salary);
		}
		
	}
	
class FullTimeFaculty extends Faculty
	{
		float basicSalary, allowance;
		
		void input(float basicSalary, float allowance, int facultyId)
		{
			super.input(basicSalary,allowance,facultyId);
			this.basicSalary = basicSalary;
			this.allowance = allowance;
		}
		
	}

class PartTimeFaculty extends Faculty
	{
		int workingHours,;
		
		void input(float basicSalary, float allowance, int facultyId)
		{
			super.input(basicSalary,allowance,facultyId);
			this.basicSalary = basicSalary;
			this.allowance = allowance;
		}
		
		
		TwoBHK(float room2Area, float roomArea, float hallArea, float price)
		{
			//Goes to  Default/Non_Parameterized constructor Super class  //super
			System.out.println("In TwoBHK PARAMETERIZED");
			this.room2Area = room2Area;
			this.roomArea = roomArea;
			this.hallArea = hallArea;
			this.price = price;
			priceCount=priceCount+price;
		}
		
		void show()
		{
			System.out.println(" Room_Area_2 : "+room2Area+" \n Room_Area_1 : "+roomArea+" \n Hall_Area : "+hallArea+" \n Price : "+price);
		}
		
	}


class Que_43_Demo
	{
		public static void main(String args[])
		{
			TwoBHK obj1 = new TwoBHK(300f, 300f, 400f, 3000f);
			TwoBHK obj2 = new TwoBHK(400f, 400f, 500f, 4000f);
			TwoBHK obj3 = new TwoBHK(500f, 500f, 600f, 5000f);
			obj1.show();
			obj2.show();
			obj3.show();
			float priceCount = obj3.priceCount;
			System.out.println(" Total Amount : "+priceCount);
		}
	}





		
		
	