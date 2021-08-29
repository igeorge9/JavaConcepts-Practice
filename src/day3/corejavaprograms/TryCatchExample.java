package day3.corejavaprograms;

public class TryCatchExample {
	
	int i=10;
	int j=0;
	public void getMethod()
	{
		System.out.println(i/j);
	}

	public static void main(String[] args) {
		TryCatchExample example= new TryCatchExample();

try {
		System.out.println("Try block is started");
		example.getMethod();
		System.out.println("Try block is ended ");
	}

catch(ArithmeticException e)
	{
		System.out.println("Error message is "+e);
//		e.printStackTrace();
	}

	}

}
