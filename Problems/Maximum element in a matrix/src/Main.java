import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        byte rows = scan.nextByte();
        byte cols = scan.nextByte();
        byte rowNeeded = 0;
        byte colNeeded = 0;
        int max = Integer.MIN_VALUE;
        int[][] matrix = new int[rows][cols];

        for (byte i = 0; i < rows; i++) {
            for (byte j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    rowNeeded = i;
                    colNeeded = j;
                }
            }
        }
        System.out.println(rowNeeded + " " + colNeeded);
    }
}