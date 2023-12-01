package userinput;

import java.util.Scanner;

public class MongsTrial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Step 1: Determine the size of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Step 2: Create a 2D array with the specified dimensions
        int[][] matrix = new int[rows][cols];

        // Step 3: Use nested loops to populate the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("The 2D array you entered:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

	}

}
	
}
