package collections1;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Ranga"),
				new Student(100, "Adam"),
				new Student(2, "Eve"));
ArrayList<Student> studentsAl = new ArrayList<>(students);
System.out.println(studentsAl);
Collections.sort(studentsAl);
System.out.println(studentsAl);
		
	}

}
