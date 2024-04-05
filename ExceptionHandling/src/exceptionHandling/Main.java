package exceptionHandling;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 try {
		int x;
		
		System.out.print("Enter an option ");
		Scanner sn = new Scanner(System.in);
		
		x = sn.nextInt();
		
		switch(x) {
		case 1:
			System.out.println("you chose one");
			
		case 2:
			System.out.println("you chose two");
			
		case 3:
			System.out.println("you chose three");
			
		break;
		}
		
		}
	 
	 
		catch(Exception ime) {
			System.out.println("enter an integer..try again");
		}
	 
	 //runs whether there's an exception or not
	 
		finally {
			System.out.print("in the finally block");
		}
		

	}

}
