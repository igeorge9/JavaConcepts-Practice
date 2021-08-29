package day4.collections;

import java.util.ArrayList;

public class UniqueNumberExample {

	public static void main(String[] args) {
		
		int array[]= {9,7,5,9,7,5,7,5,2,5,5};
		ArrayList al= new ArrayList();
		int i=0;
		for(i=0;i<array.length;i++)
		{
			int count=0;
			if(!al.contains(array[i]))
			{
				al.add(array[i]);
				count++;
				
				for(int k=i+1;k<array.length;k++)
					
				{
					if(array[i]==array[k])
					{
						count++;
					}
						
				}
				
				System.out.println(array[i]+" repeated "+count+" times");
				if(count==1)
				{
					System.out.println("The unique number is "+array[i]);
				}
			}
			
		}
		System.out.println(al);	
		
	}
}