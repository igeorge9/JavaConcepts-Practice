package day4.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapExample {

	public static void main(String[] args) {

//		HashMap<String, String> hm= new HashMap<String,String>();
//		hm.put("First", "Im the first value");
//		hm.put("Second", "Im the second value");
//		hm.put("Fourth","Im the fourth value");
//		hm.put("last", "Im the last value");
		
		HashMap<Integer, String> hm1= new HashMap<Integer,String>();
		hm1.put(1, "Im the first value");
		hm1.put(2, "Im the second value");
		hm1.put(34,"Im the fourth value");
		hm1.put(45, "Im the last value");
		Set s=hm1.entrySet();
		Iterator it= s.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			Map.Entry mp =(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
