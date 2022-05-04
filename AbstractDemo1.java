import java.lang.*;

abstract class demo
{
	public int i,j;
	public Demo();
	{
		System.out.println("Demo Consructor");
	}
	public void fun() //concrete
	{
		System.out.println("Demo fun");
	}
	public abstract void gun(); //Abstract 	virtual void gun()=0;
}

class Hello extends Demo
{
	public int x,y;
	public Hello()
	{
		System.out.println("Inside Hello Constructor");
	}
	public void sun()  //concrete
	{
		System.out.println("Inside Hello sun");
	}
	
	public void gun()  //concrete
	{
		System.out.println("Inside Hello gun");
	}
}	
	class AbstractDemo1
	{
		public static void main(String a[])
		{
			Demo dobj;
			dobj = new Demo();
			
			Hello hobj = new Hello();
			hobj.fun();
			hobj.gun();
			hobj.sun();
		}
	
}

