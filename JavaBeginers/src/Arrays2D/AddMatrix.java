package Arrays2D;

import java.util.Scanner;

/*
Задача 4
Да се реализира фунцкия  int[][] addMatrix(int[][] m1, int[][] m2), която връща нова матрица, която е сумата на
матриците, които са подадени. Забележка. Да се обърне внимание кога може да съберат две матрици. Ако двете матрици
не могат да бъдат събрани, да се върне нулев пойнтер/указател.
Made by Vladislav Velinov.
*/
public class AddMatrix {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers for dimensions and then elements of the first matrix");
//        int n = Integer.parseInt(sc.nextLine());
//        int m = Integer.parseInt(sc.nextLine());
//        int[][] matrix1 = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                matrix1[i][j] = Integer.parseInt(sc.nextLine());
//            }
//        }
//
//        System.out.println("Enter two numbers for dimensions and then elements of the second matrix");
//        n = Integer.parseInt(sc.nextLine());
//        m = Integer.parseInt(sc.nextLine());
//        int[][] matrix2 = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                matrix2[i][j] = Integer.parseInt(sc.nextLine());
//            }
//        }

        int[][] matrix1 = new int[][]{{0, 1, 2}, {9, 8, 7}};
        int[][] matrix2 = new int[][]{{6, 5, 4}, {3, 4, 5}};
        addMatrix(matrix1, matrix2);
    }


    private static int[][] addMatrix(int[][] m1, int[][] m2) {

        int[][] matrixSum = new int[m1.length][m1[0].length];
        if (m1.length == m2.length && m1[0].length == m2[0].length) {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    matrixSum[i][j] = m1[i][j] + m2[i][j];
                }
            }

            for (int i = 0; i < matrixSum.length; i++) {
                for (int j = 0; j < matrixSum[0].length; j++) {
                    System.out.println(matrixSum[i][j]);
                }
            }
        }
        return null;
    }
}