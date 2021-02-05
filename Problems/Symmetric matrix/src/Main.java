import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int rank = scan.nextInt();
        int[][] matrix = new int[rank][rank];
        boolean sym = true;
        for (int i = 0; i < rank; i++) {
            for (int j = 0; j < rank; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < rank && sym; i++) {
            for (int j = 0; j < rank && sym; j++) {
                sym = matrix[i][j] == matrix[j][i];
            }
        }

        if (sym) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}