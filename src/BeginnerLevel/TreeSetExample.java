package BeginnerLevel;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		ArrayList al= new ArrayList();
//		al.add("Irene ");
		al.add(123);
//		al.add("George");
		al.add(345);
		al.add(890);
		al.add(0);
		al.add(0);
		al.add(900);
		
		System.out.println(al);
		
		TreeSet tset= new TreeSet(al);
		
		System.out.println(tset);
		
	}

}
