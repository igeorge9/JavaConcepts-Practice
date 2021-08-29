package day2.level2progams;

public class ChildAircarftAbstract extends ParentAircarftAbstract {

	public static void main(String[] args) {
		
		ChildAircarftAbstract rules = new ChildAircarftAbstract();
		rules.body();
		rules.engine();
		rules.safety();			
	}

	@Override
	public void body() {
		System.out.println("The body of the aircarft is red logo");
	}

}
