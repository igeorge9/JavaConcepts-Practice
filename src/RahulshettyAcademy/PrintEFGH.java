package RahulshettyAcademy;

public class PrintEFGH {

	public static void main(String[] args) {

		String str="xyz";
		System.out.println(str);
		for(int i=0;i<str.length()-1;i++)
		{
			char c=(char) ((str.charAt(i))+3);
			System.out.print(c);	
		}
		
	}

}
