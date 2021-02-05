import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] matrix = new int[rows][cols];
        int[][] rotatedMatrix = new int[cols][rows];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
                rotatedMatrix[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }

        for (int[] row : rotatedMatrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}