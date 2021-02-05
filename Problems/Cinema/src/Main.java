import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int seatsAvailable = 0;
        byte[][] seats = new byte[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = scan.nextByte();
            }
        }
        int k = scan.nextInt();
        int rowNeeded = 0;

        for (int i = 0; i < rows && rowNeeded < k; i++) {
            for (int j = 0; j < cols && rowNeeded < k; j++) {
                seatsAvailable = seats[i][j] == 0 ? ++seatsAvailable : 0;
                rowNeeded = seatsAvailable >= k ? i + 1 : rowNeeded;
            }
            seatsAvailable = 0;
        }
        System.out.println(rowNeeded);
    }
}