package PracticePrograms;

public class InterfaceChild implements InterfaceParent {

	public static void main(String[] args) {
		InterfaceParent ic=new InterfaceChild();
		ic.greenGo();
		ic.RedStop();
		ic.YellowWait();
		System.out.println(traffic);
	}

	@Override
	public void greenGo() {
		
		System.out.println("Please continue the journey");
	}

	@Override
	public void RedStop() {
		
		System.out.println("Please stop the journey");
	}

	@Override
	public void YellowWait() {
		
		System.out.println("Please wait for few mins");
	}

}
