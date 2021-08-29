package day1.basicprograms;

public class PatternPyramid {

	public static void main(String[] args) {
		
		int value=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(value+" ");
				value++;
			}
			System.out.println();
		} 
	}

}
