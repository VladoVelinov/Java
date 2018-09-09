package Arrays2D;

import java.util.Scanner;

/*
Задача 8
Да се състави програма, чрез която се извеждат стойностите на елементите в двумерен масив след обръщането му
на +90 градуса.
Made by Vladislav Velinov.
*/
public class RotationOn90Degree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for dimensions of matrix and then matrix elements");
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

//        int[][] matrix = new int[][]{{4, 5}, {3, 1}};
//        DisplayMatrix.displayMatrix(matrix);
        DisplayMatrix.displayMatrix(rotateMatrixClockwise(matrix));
//        DisplayMatrix.displayMatrix(rotateMatrixCounterClockwise(matrix));
    }

    private static int[][] rotateMatrixClockwise(int[][] matrix) {

        int totalRowsOfRotatedMatrix = matrix[0].length;
        int totalColsOfRotatedMatrix = matrix.length;

        int[][] rotatedMatrix = new int[totalRowsOfRotatedMatrix][totalColsOfRotatedMatrix];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                rotatedMatrix[j][(totalColsOfRotatedMatrix - 1) - i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    private static int[][] rotateMatrixCounterClockwise(int[][] matrix) {

        int totalRowsOfRotatedMatrix = matrix[0].length;
        int totalColsOfRotatedMatrix = matrix.length;

        int[][] rotatedMatrix = new int[totalRowsOfRotatedMatrix][totalColsOfRotatedMatrix];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                rotatedMatrix[(totalRowsOfRotatedMatrix - 1) - j][i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }
}