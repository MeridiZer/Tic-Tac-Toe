package tictactoe;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] grid = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = "_";
            }
        }
        outputGrid(grid);

        int flag = 0;
        while (checkGrid(grid)) {
            System.out.print("Enter the coordinates: ");
            String[] point = scan.nextLine().split(" ");

            boolean wrongInput = false;
            for (String coordinate : point) {
                wrongInput = isNotNumber(coordinate);
                if (wrongInput) {
                    System.out.println("You should enter numbers!");
                    break;
                }
            }
            if (wrongInput) continue;

            int i = Integer.parseInt(point[0]);
            int j = Integer.parseInt(point[1]);

            byte correct = updateGrid(i, j, flag, grid);
            switch (correct) {
                case 0:
                    flag++;
                    outputGrid(grid);
                    break;

                case 1:
                    System.out.println("Coordinates should be from 1 to 3!");
                    break;

                case 2:
                    System.out.println("This cell is occupied! Choose another one!");
                    break;
            }
        }
    }


    public static void outputGrid (String[][] matrix) {
        System.out.print("---------\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("|\n");
        }
        System.out.print("---------\n");
    }


    public static byte updateGrid (int x, int y, int flag, String[][] matrix) {
        String elem;

        try {
            elem = matrix[x - 1][y - 1];
        } catch (ArrayIndexOutOfBoundsException exception) {
            return 1;
        }

        if ("X".equals(elem) || "O".equals(elem)) {
            return 2;
        }

        matrix[x - 1][y - 1] = flag % 2 == 0 ? "X" : "O";
        return 0;
    }


    public static boolean isNotNumber(String coordinate) {
        if (coordinate == null) return true;
        try {
            Integer.parseInt(coordinate);
        } catch (NumberFormatException nfe) {
            return true;
        }
        return false;
    }


    public static boolean checkGrid (String[][] matrix) {
        boolean xWins = false;
        boolean oWins = false;
        String tempDiagonal = "";
        String DiagonalTemp = "";
        int xCount = 0;
        int oCount = 0;

        for (int i = 0; i < 3; i++) {
            String tempRow = "";
            String tempCol = "";
            tempDiagonal += matrix[i][i];
            DiagonalTemp += matrix[i][2 - i];

            for (int j = 0; j < 3; j++) {
                tempRow = tempRow.concat(matrix[i][j]);
                tempCol = tempCol.concat(matrix[j][i]);
                xCount = "X".equals(matrix[i][j]) ? xCount + 1 : xCount;
                oCount = "O".equals(matrix[i][j]) ? oCount + 1 : oCount;
            }

            xWins = xWins || "XXX".equals(tempCol) || "XXX".equals(tempRow)
                    || "XXX".equals(tempDiagonal) || "XXX".equals(DiagonalTemp);
            oWins = oWins || "OOO".equals(tempCol) || "OOO".equals(tempRow)
                    || "OOO".equals(tempDiagonal) || "OOO".equals(DiagonalTemp);
        }

        if (xWins) {
            System.out.println("X wins");
            return false;
        } else if (oWins) {
            System.out.println("O wins");
            return false;
        }  else if (xCount + oCount == 9) {
            System.out.println("Draw");
            return false;
        }
        return true;
    }

}
