/*
43.	Create a class OneBHK with instance variables roomArea, hallArea and price. Then create default constructor that initializes instance variables with some values and a parameterized constructor that takes values for all instance variables and stores them in instance variables. Now create a method named show()  to print OneBHK’s instance variable values.
Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK and a new instance variable room2Area. Then create default constructor to initialize all 4 instance variables and a parameterized constructor to take the values for initialization of all instance variables. Override show() method to print all data member information.
Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print information using show method. Also print total amount of all flats. 
*/

class OneBHK
{
	float roomArea,hallArea,price;
	OneBHK()
	{
		roomArea=100;
		hallArea=200;
		price=10000;
	}
	OneBHK(float roomArea,float hallArea,float price)
	{
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}
	void show()
	{
		System.out.println("Room Area : "+roomArea);
		System.out.println("Hall Area : "+hallArea);
		System.out.println("Price : "+price);
	}	
}


class TwoBHK extends OneBHK
{
	float room2Area;
	static float sum=0;
	TwoBHK()
	{
		room2Area=100;
	}
	TwoBHK(float roomArea,float room2Area,float hallArea,float price)
	{
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.room2Area=room2Area;
		this.price=price;
		
		sum+=price;
	}
	void show()
	{
		System.out.println("Room Area : "+roomArea);
		System.out.println("Room Area : "+room2Area);
		System.out.println("Hall Area : "+hallArea);
		System.out.println("Price : "+price);
	}	
}


class Demo_43
{
	public static void main(String args[])
	{
		float sum;
		TwoBHK B1=new TwoBHK(100,100,200,10000);
		TwoBHK B2=new TwoBHK(200,200,300,20000);
		TwoBHK B3=new TwoBHK(300,300,400,30000);
		System.out.println("Flat 1 info : ");
		B1.show();
		System.out.println("\n Flat 2 info : ");
		B2.show();
		System.out.println("\n Flat 3 info : ");
		B3.show();
		
		sum=TwoBHK.sum;
		System.out.println("\n\n Total price : "+sum);
	}
}