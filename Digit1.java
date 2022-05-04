import java.util.*;

class Digit1
{
	public static void main(String arg[])
	{
		int iDigit = 0;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int iNo = sobj.nextInt();
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		while(iNo > 0)
		{
			iDigit = iNo % 10;
			
			System.out.println(iDigit);
			
			iNo = iNo / 10;
		}
	
	}

}
