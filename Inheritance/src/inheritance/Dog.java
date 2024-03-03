package inheritance;

public class Dog {
	
	private String name;
	private int age;
	private String food;
	
	
	
	//creating a constructor, used to initialize value
	public Dog(String name, int age, String food) {
		this.name = name;
		this.age = age;
		this.food =food;
		
	}
	public void speak() {
		System.out.println("My name is "+ this.name+" and am "+this.age+" years old...:\nilove, "+this.food+"..." );
		
	}
	
	//generating getters and setters
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
		this.age = age;
	}
	
	
	

}
