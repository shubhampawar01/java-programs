import java.io.*;

class Input3
{
	public static void main(String arg[])
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
				BufferedReader bobj = new BufferedReader(iobj);
				
				System.out.println("nter string:");
				String str = bobj.readLine();
				
				System.out.println("enter integer:");
				int no =Integer.parseInt(bobj.readLine);
				
				System.out.println("enter Float:");
				float r =Float.parseFloat(bobj.readLine);
				
				System.out.println("enter Double:");
				double d =Double.parseDouble(bobj.readLine);
				
				System.out.println("Entered string is:"+str);
				System.out.println("Entered Integer is:"+no);
				System.out.println("Entered float is:"+r);
				System.out.println("Entered double is:"+d);
	}
}
