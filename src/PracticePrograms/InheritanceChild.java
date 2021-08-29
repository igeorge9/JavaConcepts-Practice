package PracticePrograms;

public class InheritanceChild extends InheritanceParent{
	
	public void audioSystem()
	{
		System.out.println("audiosystem code is implemented");
	}

	public static void main(String[] args) {
		
		InheritanceChild ic=new InheritanceChild();
		ic.audioSystem();
		ic.body();
		ic.brakes();
		ic.engine();
		System.out.println(ic.color);
	}

}
