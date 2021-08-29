package day5.workouts;

public class Hello1 {

	public static void main(String[] args) {

		String str="AHCECLWLXO";
//		str.contains("hello");
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
				
				System.out.print(str.charAt(i));
			}
			}
		System.out.println();
		String str1="ahceclwlxo";
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
				
				System.out.print(str1.toUpperCase().charAt(i));
			}
			}
	}

}
