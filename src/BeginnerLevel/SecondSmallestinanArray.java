package BeginnerLevel;

import java.util.Arrays;

public class SecondSmallestinanArray {

	public static void main(String[] args) {
		
		int array1[]= {3,7,86,69,69,65,0,59,2,1,66};
//		Arrays.sort(array1);
		int minvalue=array1[0];
		int secminvalue=array1[0];
		for(int i=1;i<array1.length;i++)
		{
			if(minvalue>array1[i])
			{
				secminvalue=minvalue;
				minvalue=array1[i];
			}
			else if(secminvalue>array1[i])
			{
				secminvalue=array1[i];
//				System.out.println("Second minimum value is"+secminvalue);
			}
			
//			System.out.print(array1[i]+" ");
		}
		System.out.println("Minimum value is "+minvalue +" and Second minimum value is "+secminvalue);
		

		
//        System.out.println();		
//		System.out.println("The smallest value in the array is "+array1[0]);
//		System.out.println("The second smallest value in the array is "+array1[1]);

	}
}
