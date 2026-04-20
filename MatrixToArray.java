import java.util.Scanner;

public class MatrixToArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows, columns;

        // Taking rows and columns
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        columns = sc.nextInt();

        // Creating 2D array
        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");

        // Input for matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Creating 1D array
        int[] array = new int[rows * columns];

        int index = 0;

        // Copying elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display 1D array
        System.out.println("\nElements in 1D array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
