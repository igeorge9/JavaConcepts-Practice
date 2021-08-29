package day1.basicprograms;

public class Palindrome {

	public static void main(String[] args) {
		
		String value="Original";
		int length=(value.length())-1;
		String finalstring="";
		System.out.println("Length of the string is "+length);
		for(int i=length;i>=0;i--)
		{
			finalstring=finalstring +value.charAt(i);			
		}
		System.out.println("The final reversed string is "+finalstring);	
		if (finalstring.equalsIgnoreCase(value))
		{
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
		
}

