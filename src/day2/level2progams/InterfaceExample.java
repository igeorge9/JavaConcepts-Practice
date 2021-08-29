package day2.level2progams;

public class InterfaceExample implements InterfaceProgram,InterfaceProgramTwo {

	public static void main(String[] args) {
		
		InterfaceProgram ie= new InterfaceExample();
		InterfaceProgramTwo ip= new InterfaceExample();
		ie.greenGo();
		ie.redStop();
		ie.yellowWait();
		ip.secondInterface();
	}

	@Override
	public void greenGo() {
		
		System.out.println("Please continue the journey");
	}

	@Override
	public void redStop() {
		
		System.out.println("Please stop the vehicle");
	}

	@Override
	public void yellowWait() {

		System.out.println("Please wait till it goes green");
	}

	@Override
	public void secondInterface() {
		System.out.println("Hello, Im from the second Interface program ");
	}
	

}
