import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: 3x3 Matrix
        int[][] matrix = new int[3][3];
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Variables to store the sums of the diagonals
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        // Calculate the diagonal sums
        for (int i = 0; i < 3; i++) {
            leftDiagonalSum += matrix[i][i]; // Elements of the left diagonal
            rightDiagonalSum += matrix[i][2 - i]; // Elements of the right diagonal
        }

        // Output: Diagonal sums
        System.out.println("Sum of left diagonal elements: " + leftDiagonalSum);
        System.out.println("Sum of right diagonal elements: " + rightDiagonalSum);

        scanner.close();
    }
}
