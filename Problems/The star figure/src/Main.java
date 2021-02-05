import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rank = scan.nextInt();
        char[][] star = new char[rank][rank];
        
        for (int i = 0; i < rank; i++) {
            for (int j = 0; j < rank; j++) {
                star[i][j] = i == rank / 2 || j == rank / 2 || i + j == rank - 1 || i == j ? '*' : '.';
            }
        }

        for (char[] vector: star) {
            for (char character: vector) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }
}