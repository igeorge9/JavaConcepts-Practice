package BeginnerLevel;

public class GettersAndSettersExample {

	private String name;
	private int age;
	private int amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=19 && age<=60)
		this.age = age;	
		else
		System.out.println("Please enter valid age");
	}
	
	public void setAmount(int amount)
	{
		if(amount>=1000 && amount<=100000)
			this.amount =amount;
		else
			System.out.println("Please enter valid amount");
	}
	public int getAmount(){
		return amount;
	}
	
	
	
}
