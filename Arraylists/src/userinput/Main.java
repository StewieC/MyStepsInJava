package userinput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store the student names
        ArrayList<String> studentNames = new ArrayList<>();

        // Prompt the user to enter 5 student names
        System.out.println("Please enter 5 student names:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            studentNames.add(studentName);
        }

        // Print the student names stored in the ArrayList
        System.out.println("The student names are:");
        for (String studentName : studentNames) {
            System.out.println(studentName);
        }
    }
}

