package AbstractClasses;

public class Cat extends Animal {

	

	public Cat(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNoise() {
		System.out.println("cat says meeow!!!");		
	}

}
