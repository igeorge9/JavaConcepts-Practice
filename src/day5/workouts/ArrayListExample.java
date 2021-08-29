package day5.workouts;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

// 		Given arraylist ar[]={1,8,5,12,9,2}. 
//		Place one in the first position and keep others in descending order
		
		ArrayList<Integer> arr1= new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(8);
		arr1.add(5);
		arr1.add(12);
		arr1.add(9);
		arr1.add(2);
		System.out.println(arr1);
		for(int i=1;i<arr1.size()-1;i++)
		{
			
//			System.out.println(var);
			for(int j=i;j<arr1.size()-1;j++)
			{
				int var1=0,var2=0;
			if(arr1.get(i)<arr1.get(j+1))
				{
					
					System.out.println(arr1.get(i));
				}
			}
//			System.out.println(var+ "is");
		}
		ArrayList arr2= new ArrayList();
		
	}

}
