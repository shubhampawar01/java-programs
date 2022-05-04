import java.lang.*;
import java.io.*;
import java.util.*;

class Demo5
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter name:");
		String str = sobj.nextLine();
		
		System.out.println("Enter age:");
		int no = sobj.nextInt();
		
		System.out.println("Enter percentage:");
		float per = sobj.nextFloat();
		
		
		
		System.out.println("Your name is:"+str);	
		System.out.println("Your age is:"+no);
		System.out.println("Your percentage is:"+per);
				
		
		
	}

}
