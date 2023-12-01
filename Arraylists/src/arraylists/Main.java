package arraylists;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Mustang");
		cars.add("audi");
		cars.add("benzo");
		cars.add("lambo");
		cars.add("ferrari");
		cars.add("beamer");
		cars.add("volvo");
		
		System.out.println(cars.get(3));
		//change an element of the array
		cars.set(3, "Gari moshi");
		
		//print the element
		System.out.println(cars.get(3));
		
		//remove an item
		cars.remove(3);
		//System.out.print(cars);
		
		//remove all elements
		//cars.clear();
		//System.out.println(cars);
		System.out.print(cars.size());

	}

}
