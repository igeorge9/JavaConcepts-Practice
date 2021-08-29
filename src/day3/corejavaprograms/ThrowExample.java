package day3.corejavaprograms;

public class ThrowExample {
	
	int arr[]= new int[5];
	int variable1=10;
	public void getArrayElements() 
	{
		System.out.println("The array element is "+arr[4]);
	}
	public void getQuoitent() 
	{
		System.out.println(variable1/0);
		throw new ArithmeticException();
		
	}
	
	public static void main(String[] args) {
		
		ThrowExample example1=new ThrowExample();
		
		try {
			System.out.println("Try block is started");
			example1.getArrayElements();
			example1.getQuoitent();
		}
		catch(IndexOutOfBoundsException iobe)
		{
			System.out.println(iobe);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}

}
