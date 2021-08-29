package day1.basicprograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String value="OriginalString";
		int length=(value.length())-1;
		System.out.println("Length of the string is "+length);
		for(int i=length;i>=0;i--)
		{
			System.out.print(value.charAt(i));
		}
	}

}
