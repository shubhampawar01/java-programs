import java.lang.*;
import java.util.*;

class Factor
{
	void fact(int Value)
	{
		int iCnt=0;
		
		for(iCnt=1;iCnt<Value;iCnt++)
		{
			if((Value%iCnt)==0)
			{
				System.out.println(iCnt);
			}		
		}	

	}

	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sobj.nextInt();
	
		Factor fobj = new Factor();
		fobj.fact(num);
		
	}
	

}
