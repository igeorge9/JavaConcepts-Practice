package RahulshettyAcademy;

import java.util.Scanner;

public class Day3Program04 {

	public static void main(String[] args) {

		int fact=1;
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		if(number<0)
		{
			System.out.println("Please enter a positive number");
		}
		for(int i=number;i>1;i--)
		{
			fact=i*fact;
		}
		System.out.println("Factorial of "+number+" is "+fact);
	}

}
