import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int col1 = scan.nextInt();
        int col2 = scan.nextInt();

        for (int i = 0; i < rows && cols > 1 && col1 != col2; i++) {
            matrix[i][col1] = matrix[i][col1] + matrix[i][col2];
            matrix[i][col2] = matrix[i][col1] - matrix[i][col2];
            matrix[i][col1] = matrix[i][col1] - matrix[i][col2];
        }

        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}