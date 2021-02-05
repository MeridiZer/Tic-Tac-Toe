import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int rank = scan.nextInt();
        int[][] matrix = new int[rank][rank];

        for (int i = 0; i < rank; i++) {
            for (int j = 0; j < rank; j++) {
                matrix[i][j] = Math.abs(i - j);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}