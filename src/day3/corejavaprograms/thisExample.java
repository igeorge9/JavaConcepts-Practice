package day3.corejavaprograms;

public class thisExample {
	
	String name;										//instance variables
	String address;
	static String city="Kollam";
	static int value=1;
	
	public thisExample(String name,String address)
	{
		this.name=name;
		this.address=address;
		System.out.println(name+" "+address+" "+city);
	}
	
	public static void moreInfo()
	{
		value++;
		System.out.println("This is more information "+value);	
	}
	
	public static void staticMethod()
	{
		System.out.println(city);
	}
	public static void main(String[] args) {
		
//		thisExample obj1= new thisExample("Mahesh","AR nagar","Kollam");
//		thisExample obj2=new thisExample("Anitha", "MN RoAD", "Kollam");
		thisExample obj3=new thisExample("Mahesh","AR nagar");
		thisExample.moreInfo();
		thisExample.staticMethod();
		
	
	}

}
