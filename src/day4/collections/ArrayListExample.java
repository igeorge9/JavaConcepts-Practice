package day4.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
	
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(3);
		al.add(33);
		al.add(43);
		al.add(90);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		System.out.println(al.contains(56));
		System.out.println(al.get(1));
		System.out.println(al.indexOf(43));
		System.out.println(al.size());
		
	}

}
