package day2.level2progams;

public class ChildInheritance extends ParentInheritance{
	
	public void color()
	{
		System.out.println("color is implemented");
	}
	public void engine()
	{
		System.out.println("engine is implemeted");
	}

	public static void main(String[] args) {
		
		ChildInheritance value= new ChildInheritance();
		value.brakes();
		value.color();
		value.engine();
		value.tyre();
	}

}
