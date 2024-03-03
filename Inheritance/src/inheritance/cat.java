package inheritance;

public class cat extends Dog{
	
	private String food;

	public cat(String name, int age, String food) {
		super(name, age, food);
		this.setFood(food);
		// TODO Auto-generated constructor stub
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

}
