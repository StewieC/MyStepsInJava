package example2;

public class Koshy extends Student{
	
	private String colour;

	public Koshy(String name, int age, String course, String colour) {
		super(name, age, course);
		this.colour = colour;
		// TODO Auto-generated constructor stub
	}
	
	public void speak() {
		System.out.println("Myname is "+this.name+" and am "+this.age+"years old\nI pursue "+this.course+"and am colour"+this.colour+"...");
		
	}
	

}
