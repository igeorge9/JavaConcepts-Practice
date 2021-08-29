package day3.corejavaprograms;

public class SuperkywdChild extends SuperKywdParent{

	String message="Child value";
	
	public SuperkywdChild()								//Using super keyword for constructor
	{
		super();
		System.out.println("This is my child constructor");
	}
	
	public void methodSuper()						//Using super keyword for methods
	{
		super.methodSuper();
		System.out.println("Method inside child class");
	}
	public void getStringData()						//Using super keywords for variables
	{
		System.out.println(super.message);
		System.out.println(message);
	}

	public static void main(String[] args) {
		
		SuperkywdChild child= new SuperkywdChild();
		
		child.getStringData();
		child.methodSuper();
	}

}
