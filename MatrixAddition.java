
    import java.util.Scanner;

 public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for user input

        // Step 1: Take matrix dimensions from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Step 2: Declare three 2D arrays
        int[][] a = new int[rows][cols];   // First matrix
        int[][] b = new int[rows][cols];   // Second matrix
        int[][] sum = new int[rows][cols]; // Resultant matrix (sum)

        // Step 3: Input elements of first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                a[i][j] = sc.nextInt();

        // Step 4: Input elements of second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                b[i][j] = sc.nextInt();

        // Step 5: Add corresponding elements of both matrices
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sum[i][j] = a[i][j] + b[i][j];

        // Step 6: Display the resulting matrix
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();  // Move to the next row
        }

        sc.close(); // Close the scanner
    }
}


