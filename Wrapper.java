import java.io.*;

class Wrapper
{
	public static void main(String arg[])
	{
		int no = 11;
		
		Integer iobj = new Integer(11);
		
		int i = iobj;   //unboxing
		
		Integer iobj2 = no;  //boxing
		
		System.out.println(no);
		System.out.println(iobj);
		System.out.println(iobj2);
		System.out.println(i);
		
	}
	
}	
