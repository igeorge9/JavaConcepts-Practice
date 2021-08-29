package RahulshettyAcademy;

import java.util.Scanner;

public class Day3Program03 {

	public static void main(String[] args) {
		
//			System.out.println("Enter the first number");
//			Scanner sc=new Scanner(System.in);
//			int number= sc.nextInt();
//			System.out.println("Enter the second number");
//			Scanner sc1=new Scanner(System.in);
//			int number1= sc.nextInt();
		int number=20;
		int number1=30;
		int flag=0;
			for(number=20;number<=number1;number++)
			{
				for(int i=2;i<number/2;i++)
				{

				if(number%i!=0)
					flag=1;
				else
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.println(number+ " prime");
		}
		}
		
	}


