package AbstractClasses;

public abstract class Animal {
	int age;
	String name;
	
	public abstract void makeNoise();
	
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void name() {
		System.out.println("my name is "+name+" iam "+age+" yrs old");
	}

}
