package example2;

public class Student {
	
	public String name;
	public int age;
	public String course;
	
	//generate constructors
	public Student(String name, int age, String course) {
	;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public void intro() {
		System.out.println("Hello this is a student,\nName: "+this.name+"\nAge:"+this.age+"\nCourse:"+this.course);
	}

}
