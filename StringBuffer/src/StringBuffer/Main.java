package StringBuffer;

public class Main {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.capacity());
		//it give 16
		
		//create a new object
		StringBuffer koshy = new StringBuffer("koshy");
		
		System.out.println(koshy.capacity());
		//prints the length plus 16 as the capacity => 21
		
		System.out.println(koshy.length());
		
		
	
	}

}
