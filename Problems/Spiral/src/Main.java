import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] spiral = new int[size][size];
        char direction = 'r';
        int row = 0;
        int col = 0;
        int boundary = size - 1;
        int sizeLeft = size - 1;
        boolean secondRotation = false;
        for (int i = 1; i < size * size + 1; i++) {
            spiral[row][col] = i;

            switch (direction) {
                case 'r':
                    col++;
                    break;

                case 'd':
                    row++;
                    break;

                case 'l':
                    col--;
                    break;

                case 'u':
                    row--;
                    break;

                default:
                    System.out.println("Hyperskill wants me to add default case for no reason");
                    break;
            }

            if (i == boundary) {
                boundary += sizeLeft;

                if (!secondRotation) {
                    secondRotation = true;
                } else {
                    secondRotation = false;
                    sizeLeft--;
                }

                switch (direction) {
                    case 'r':
                        direction = 'd';
                        break;

                    case 'd':
                        direction = 'l';
                        break;

                    case 'l':
                        direction = 'u';
                        break;

                    case 'u':
                        direction = 'r';
                        break;

                    default:
                        System.out.println("Hyperskill wants me to add default case for no reason");
                        break;
                }
            }
        }
        for (int[] rows : spiral) {
            for (int elem : rows) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}