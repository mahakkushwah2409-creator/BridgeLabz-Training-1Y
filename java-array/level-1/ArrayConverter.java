import java.util.Scanner;

    public class ArrayConverter {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // a. Take user input for rows and columns
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int columns = sc.nextInt();

            // Create 2D array (Matrix) and take user input
            int[][] matrix = new int[rows][columns];
            System.out.println("Enter the elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // b. Create a 1D array of size rows * columns
            int[] flatArray = new int[rows * columns];

            // c. Define index variable and loop through 2D array to copy elements
            int index = 0;
            // d. Nested for loop: outer for rows, inner for columns
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    flatArray[index] = matrix[i][j];
                    index++; // Increment index after each copy
                }
            }

            // Displaying the result
            System.out.println("\nElements in the 1D array:");
            for (int element : flatArray) {
                System.out.print(element + " ");
            }

            sc.close();
        }
    }