package Arrays2D;

import java.util.Scanner;

/*
Задача 4.1
Да се реализира функция void MultiplyMatrixWithScalar(int[][] m,int scalar) която умножава подадената матрица с
числото, което е подадено.
Made by Vladislav Velinov.
*/
public class MultiplyMatrixWithScalar {
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

        System.out.println("Enter scalar for the matrix");
        int number = Integer.parseInt(sc.nextLine());

//        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int number = 5;

        multiplyMatrixWithScalar(matrix, number);
    }

    private static void multiplyMatrixWithScalar(int[][] m, int scalar) {

        int[][] scalarMatrix = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                scalarMatrix[i][j] = m[i][j] * scalar;
            }
        }

        for (int i = 0; i < scalarMatrix.length; i++) {
            for (int j = 0; j < scalarMatrix[0].length; j++) {
                System.out.print(" " + scalarMatrix[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}