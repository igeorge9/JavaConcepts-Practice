package day1.basicprograms;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int [][] grid= {
				{0,9},
				{1,2},
				{6,0,9}
						};
		System.out.println("length of array is "+grid.length);
		for(int i=0;i<=(grid.length)-1;i++)
		{
			for(int j=0;j<=(grid[i].length)-1;j++) 
			{
				System.out.print(grid+" ");
			}
			System.out.println();
			
			
	}
	}
}
