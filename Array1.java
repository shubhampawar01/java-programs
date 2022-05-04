import java.lang.*;

class Array1
{
	public static void main(String arg[])
	{
		int iCnt = 0;
		int arr[]= new int[5];
		
		arr[0]= 10;
		arr[1]= 20;
		arr[2]= 30;
		arr[3]= 40;
		arr[4]= 50;
		
		System.out.println("Size of Array"+arr.length);//length is the property for array in java
		
		//System.out.println("Element of array"+arr); //here we get hashcode on compiler
	
	
	
		/*for(iCnt=0;iCnt<arr.length;iCnt++)
		{
			System.out.println(arr[iCnt]);
		}
		*/
		
		
		while(iCnt<arr.length) //this is for each loop
		{
			System.out.println(arr[iCnt]);
			iCnt++;
		}
	
		System.out.println("Data by for each loop");
		for(int no : arr)
		{
			System.out.println(no);
		}
	
	}
	

}
