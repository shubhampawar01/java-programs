
import java.util.*;



class Addition
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int iNo1 = sobj.nextInt();
		
		System.out.println("Enter Second Number:");
		int iNo2 = sobj.nextInt();
		
		int sum = summetion(iNo1,iNo2);
		
		System.out.println("Addition is::"+sum);
	}
	
	public static int summetion(int x, int y)
	{
	 	int sum =x+y;
	
		return sum;
		
	}
}


