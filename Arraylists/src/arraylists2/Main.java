package arraylists2;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(100);
		x.add(1000);
		x.add(10000);
		x.add(100000);
		x.add(10000000);
		for(int i : x) {
			System.out.println(i);
		}
		

	}

}
