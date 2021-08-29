package day3.corejavaprograms;

public class ConstructorExample {
	
	public ConstructorExample()
	{
		System.out.println("This is a deafult constructor");
	}
	public ConstructorExample(int a, int b)
	{
		System.out.println("This is a parameterized constructor with integer "+a+b);
		
	}
	public ConstructorExample(String variable)
	{
		System.out.println("This is a parameterized constructor with  "+variable);
	}
	public void FirstMethod()
	{
		System.out.println("Im the method in this class");
	}
	public static void main(String[] args) {
		
		ConstructorExample ce= new ConstructorExample();
		ConstructorExample ce1= new ConstructorExample("String variable");
		ConstructorExample ce2= new ConstructorExample(15,987);
		ce.FirstMethod();
		
	}

}
