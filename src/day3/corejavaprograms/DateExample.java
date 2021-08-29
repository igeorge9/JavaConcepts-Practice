package day3.corejavaprograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date date= new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdf1= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println(sdf.format(date));
		System.out.println(sdf1.format(date));
			
	}

}
