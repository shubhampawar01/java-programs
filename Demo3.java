import java.lang.*;

class Demo
{
  public int i;
	public int j;
	
	public Demo()
	{
		this.i=0;
		this.j=0;
	}
	
	public void fun()
	{
		System.out.println("Inside fun");
	}
	
	public void gun()
	{
		System.out.println("Inside gun");
	}

}
class Derived 
{
	public void fun()
	{
		System.out.println("Inside Derived fun");
	}
	
	public void gun()
	{
		System.out.println("Inside Derived gun");
	}
}

class Demo3
{
		public static void main(String arg[])
		{
		System.out.println("Inside main");
		Demo obj = new Demo();
		obj.fun();
		obj.gun();
		
		Derived dobj= new Derived();
		dobj.fun();
		dobj.gun();
		
		}
}
