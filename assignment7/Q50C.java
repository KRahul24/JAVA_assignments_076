package assignment7;
		class Person1
		{
			int pid;
			String name;
			public Person1(int pid, String name) 
			{	super();
				this.pid = pid;
				this.name = name;
			}
			public boolean equals (Object obj)
			{
				Person1 p=(Person1)obj;
				if(this.pid==p.pid && this.name==p.name)
				{
					return true;
				}
				return false;
			}
		}
		public class Q50C
		{
			public static void main(String[] args) 
			{
				Person1 p1=new Person1(76, "Rahul");
				Person1 p2=new Person1(92, "Shubham");
				Person1 p3=new Person1(76, "Rahul");
				Person1 p4=p2;
				System.out.println("p1 and p2 has Equal content? =>"+p1.equals(p2)); /*equal() method has overridden. 
																						so, it will NOT check if reference of objects is same or not, BUT will check if defined content is same or not!*/
				System.out.println("p1 and p3 has Equal content? =>"+p1.equals(p3)); 
				System.out.println("p4 and p2 has Equal content? =>"+p2.equals(p4)); 
			}
		}
