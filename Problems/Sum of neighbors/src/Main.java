import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String mainString = "start";
        String temp = scan.nextLine() + "\n";
        while (!"end".equals(temp)) {
            mainString = "start".equals(mainString) ? temp : mainString + temp + "\n";
            temp = scan.nextLine();
        }

        String[] oneDim = mainString.split("\n");
        int rows = oneDim.length;
        int cols = oneDim[0].split(" ").length;
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] tempArray = oneDim[i].split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(tempArray[j]);
            }
        }

        int[][] matrixSummed = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int up = i == 0 ? matrix[rows - 1][j] : matrix[i - 1][j];
                int down = i == rows - 1 ? matrix[0][j] : matrix[i + 1][j];
                int left = j == 0 ? matrix[i][cols - 1] : matrix[i][j - 1];
                int right = j == cols - 1 ? matrix[i][0] : matrix[i][j + 1];
                matrixSummed[i][j] = up + down + left + right;
                System.out.print(matrixSummed[i][j] + " ");
            }
            System.out.println();
        }
    }
}