//41.	Write a program to demonstrate this() construct functionality.

import java.util.Scanner;

				class ThisConstruct
				{
					int roll;
					String name;
					
					ThisConstruct(int roll,String name)
					{
						System.out.println("IN 2-PARAMERIZED CONSTRUCTOR");
						this.roll=roll;
						this.name=name;
						
					}
					
					ThisConstruct(int roll, String name, String gender)
					{
						
						this(roll,name);
						System.out.println("IN 3-PARAMERIZED CONSTRUCTOR");
						System.out.println("Name: "+this.name);
						System.out.println("Roll no: "+this.roll);	
						System.out.println(gender);
						
					}
				}

				class ThisConstructDemo
				{
					int roll;
					String name;
					
					public static void main(String[] args)
					{
						Scanner scan=new Scanner(System.in);
						System.out.print("Enter Roll no: ");
						int roll=scan.nextInt();
						System.out.print("Enter Name: ");
						String name=scan.next();
						System.out.print("Gender: ");
						String gender=scan.next();
						
						ThisConstruct s1=new ThisConstruct(roll,name,gender);
					}
				}
				
		