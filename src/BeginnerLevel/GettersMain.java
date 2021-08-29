package BeginnerLevel;

public class GettersMain extends GettersAndSettersExample {

	public static void main(String[] args) {
		
		GettersAndSettersExample value= new GettersAndSettersExample();
		value.setAge(5);
		value.setAmount(2577856);
		value.setName("Le Apollo");
		
		System.out.println(value.getName());
		System.out.println(value.getAge());
		System.out.println(value.getAmount());
	
		
	}

}
