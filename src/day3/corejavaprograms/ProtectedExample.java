package day3.corejavaprograms;

public class ProtectedExample {

/*
 * This is example for public method
 */
	public String value="This is a public variable";
	public void publicMethod()
	{
		System.out.println("This is a public method");
		
	}
	/*
	 * This is example for private method
	 */
	private String value1="This is a private variable"; 
	private void privateMethod()
	{
		System.out.println("This is a private method");
		
	}
	/*
	 * This is default mathod
	 */
	 String value3="This is a default variable";
	void defaultMethod()
	{
		System.out.println("This is a default method");
	}
	protected String value4 ="This is a protected variable";
	protected void protectedMethod()
	{
		System.out.println("This is a protected method");
	}
	public static void main(String[] args) {

		ProtectedExample example1= new ProtectedExample();
		example1.privateMethod();
		System.out.println(example1.value1);
	}

}
