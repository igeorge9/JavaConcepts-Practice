package RahulshettyAcademy;

import java.sql.Array;
import java.util.ArrayList;

public class Day4Program01 {

	public static void main(String[] args) {

		String arr[]= {};
		ArrayList<String> al= new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		System.out.println(al);
		System.out.println();
		al.add("NOW I KNOW MY ABCs");
		System.out.println("First set of array is "+al);
		System.out.println();
		al.add(0,"12345");
		System.out.println("Updated array is "+al);
		System.out.println();
		al.remove("D");
		al.remove("E");
		al.remove("F");
		al.remove("G");
		System.out.println("Recent array is "+al);
	}

}
