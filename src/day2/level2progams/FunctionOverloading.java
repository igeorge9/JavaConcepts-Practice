package day2.level2progams;

public class FunctionOverloading {

	public void getData() 
	{
		System.out.println("No arguments inside the function");
	}
	public void getData(int a)
	{
		System.out.println(a);
	}
	public void getData(String message)
	{
		System.out.println(message);
	}
	public void getData(int x, String y)
	{
		System.out.println(y);
	}
	public static void main(String[] args) 
	{
		FunctionOverloading value= new FunctionOverloading();
		value.getData();
		value.getData(5);
		value.getData("String arguments are printed");
		value.getData(8, "Eight is the value of x");
	}

}
