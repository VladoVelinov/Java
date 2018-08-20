package Arrays2D;

import java.util.Scanner;

/*
Задача 6
Да се реализира функция int[][] TransposeMatrix(int[][] matrix). Функцията трябва да върне нова матрица, която е
транспонирана матрицата, която и е подадена. Да транспонира матрица означава да обърне елементите по главния
диагонал(главния диагонал е от ляво на дясно).
Made by Vladislav Velinov.
*/
public class TransposeMatrix {
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers for dimensions of matrix and then matrix elements");
//        int n = Integer.parseInt(sc.nextLine());
//        int m = Integer.parseInt(sc.nextLine());
//        int[][] matrix = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                matrix[i][j] = Integer.parseInt(sc.nextLine());
//            }
//        }

        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        transposeMatrix(matrix);

    }

    private static int[][] transposeMatrix(int[][] m) {
        int[][] transMatrix = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                transMatrix[i][j] = m[j][i];
            }
        }

        for (int i = 0; i < transMatrix.length; i++) {
            for (int j = 0; j < transMatrix[0].length; j++) {
                System.out.println(transMatrix[i][j]);
            }
        }
        return null;
    }
}