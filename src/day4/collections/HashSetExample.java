package day4.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<Integer> hs= new HashSet<Integer>();
		hs.add(1);
		hs.add(12);
		hs.add(13);
		hs.add(56);
		hs.add(90);
		hs.add(467);
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
