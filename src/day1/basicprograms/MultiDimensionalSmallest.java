package day1.basicprograms;

public class MultiDimensionalSmallest {

	public static void main(String[] args) {
		int [][] grid= {
				{18,9,41},
				{31,5,20},
				{6,5,3}
						};
		int location=0;
//		System.out.println("length of array is "+grid.length);
		int tempvariable =grid[0][0];
		for(int i=0;i<=(grid.length)-1;i++)
		{
			for(int j=0;j<=(grid[i].length)-1;j++) 
			{
				
				if(grid[i][j]<tempvariable)
				{
					tempvariable=grid[i][j];	
					location=j;
				}
		    }
     	}
		System.out.println("Smallest number is "+tempvariable);
		System.out.println("Posiotion of smallest number is "+location);		
}
}
