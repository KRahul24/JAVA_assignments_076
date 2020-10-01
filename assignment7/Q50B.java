package assignment7;

class Person
{
	int pid;
	String name;
	public Person(int pid, String name) 
	{	super();
		this.pid = pid;
		this.name = name;
	}
	
}
public class Q50B
{
	public static void main(String[] args) 
	{
		Person p1=new Person(76, "Rahul");
		Person p2=new Person(92, "Shubham");
		Person p3=p2;
		System.out.println("p1 and p2 has Equal reference? =>"+p1.equals(p2)); //equal() method has not overridden. so, it will check if reference of objects is same or not.
		System.out.println("p1 and p3 has Equal reference? =>"+p2.equals(p3)); 
	}
}
