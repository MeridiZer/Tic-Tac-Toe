import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static boolean check(int len, int[][] rowsAndCols, int[][] matrices) {
        boolean solved = true;
        int[][] temp = new int[3][len];
        for (int i = 0; i < len && solved; i++) {
            for (int j = 0; j < len; j++) {
                temp[0][j] = rowsAndCols[i][j];
                temp[1][j] = rowsAndCols[j][i];
                temp[2][j] = matrices[i][j];
            }
            Arrays.sort(temp[0]);
            Arrays.sort(temp[1]);
            Arrays.sort(temp[2]);
            for (int j = 0; j < len && solved; j++) {
                solved = temp[0][j] == j + 1 && temp[1][j] == j + 1 && temp[2][j] == j + 1;
            }
        }
        return solved;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int sizeSq = (int) Math.pow(size, 2);

        int[][] matrix = new int[sizeSq][sizeSq];
        for (int i = 0; i < sizeSq; i++) {
            for (int j = 0; j < sizeSq; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int[][] miniMatrices = new int[sizeSq][sizeSq];
        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < sizeSq; j++) {
                    miniMatrices[i / size + j / size + k * size][i * size + j % size] = matrix[i + k * size][j];
                }
            }
        }

        if (check(sizeSq, matrix, miniMatrices)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

//*************************************************************************************************
//    int[][] matrix = new int[sizeSq][sizeSq];
//        for (int i = 0; i < sizeSq; i++) {
//            for (int j = 0; j < sizeSq; j++) {
//                matrix[i][j] = scan.nextInt();
//            }
//        }
//        int[][] miniMatrices = new int[sizeSq][sizeSq];
//        for (int k = 0; k < size; k++) {
//            for (int i = 0; i < size; i++) {
//                for (int j = 0; j < sizeSq; j++) {
//                    miniMatrices[i / size + j / size + k * size][i * size + j % size] = matrix[i + k * size][j];
//                }
//            }
//        }
//        boolean row = true;
//        boolean col = true;
//        boolean square = true;
//
////        for (int i = 0; i < sizeSq; i++) {
////            System.out.println(Arrays.toString(matrix[i]));
////        }
////        System.out.println();
////        for (int i = 0; i < sizeSq; i++) {
////            System.out.println(Arrays.toString(miniMatrices[i]));
////        }
//
//        for (int i = 0; i < sizeSq && row && col && square; i++) {
//            for (int j = 0; j < sizeSq && row && col && square; j++) {
//                for (int k = j + 1; k < sizeSq && row; k++) {
//                    row = matrix[i][j] != matrix[i][k];
//                }
//                for (int k = i + 1; k < sizeSq && col; k++) {
//                    col = matrix[i][j] != matrix[k][j];
//                }
//                for (int k = j + 1; k < sizeSq && square; k++) {
//                    square = miniMatrices[i][j] != miniMatrices[i][k];
//                }
//            }
//        }
//
//        if (row && col && square) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//**************************************************************************************************************

//**************************************************************************************************************
//        for (int i = 0; i < sizeSq && square; i++) {
//            for (int j = 0; j < sizeSq && square; j++) {
//                for (int k = i + 1, l = j + 1; k < sizeSq && l < sizeSq && square; k++, l++) {
//                    square = matrix[i][j] != matrix[k][l] &&
//                            matrix[Math.abs(-(sizeSq - 1) + i)][Math.abs(-(sizeSq - 1) + i)] !=
//                                    matrix[Math.abs(-(sizeSq - 1) + k)][Math.abs(-(sizeSq - 1) + l)];
//                }
//            }
//        }